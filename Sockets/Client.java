package Sockets;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Client {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                try (SocketChannel socketChannel = SocketChannel.open()) {
                    socketChannel.connect(new InetSocketAddress("localhost", 8080));

                    // Send request
                    String request = "Request " + (i + 1);
                    ByteBuffer requestBuffer = ByteBuffer.wrap(request.getBytes());
                    socketChannel.write(requestBuffer);

                    // Receive response on the same channel
                    ByteBuffer responseBuffer = ByteBuffer.allocate(1024);
                    int bytesRead = socketChannel.read(responseBuffer);
                    responseBuffer.flip();
                    byte[] responseBytes = new byte[bytesRead];
                    responseBuffer.get(responseBytes);
                    String response = new String(responseBytes);
                    System.out.println("Received response from server: " + response);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
