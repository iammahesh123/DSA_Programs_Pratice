package Sockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8080));

            System.out.println("Server is running on port 8080...");

            ExecutorService executorService = Executors.newFixedThreadPool(10);

            while (true) {
                SocketChannel socketChannel = serverSocketChannel.accept();
                System.out.println("Client connected: " + socketChannel.getRemoteAddress());

                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        handleClient(socketChannel);
                    }
                });
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleClient(SocketChannel socketChannel) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead;

            // Read requests
            while ((bytesRead = socketChannel.read(buffer)) > 0) {
                buffer.flip();
                byte[] requestBytes = new byte[buffer.remaining()];
                buffer.get(requestBytes);
                String request = new String(requestBytes);

                System.out.println("Received request from client: " + request);

                // Process the request (You can add your logic here)

                // Send response back on the same channel
                String response = "Hello from server!";
                ByteBuffer responseBuffer = ByteBuffer.wrap(response.getBytes());
                socketChannel.write(responseBuffer);

                buffer.clear();
            }

            // Close the socketChannel
            socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}