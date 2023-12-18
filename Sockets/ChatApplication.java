package Sockets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatApplication {
    private JFrame frame;
    private JTextField textField;
    private JTextArea textArea;
    private PrintWriter writer;
    private BufferedReader reader;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new ChatApplication().initialize();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void initialize() throws IOException {
        frame = new JFrame("Chat Application");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        frame.getContentPane().add(textField, BorderLayout.SOUTH);
        textField.setColumns(10);

        JButton btnConnect = new JButton("Connect");
        btnConnect.addActionListener(e -> connectToServer());
        frame.getContentPane().add(btnConnect, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        textArea.setEditable(false);

        frame.setVisible(true);
    }

    private void connectToServer() {
        String serverIP = JOptionPane.showInputDialog(frame, "Enter Server IP:");
        if (serverIP != null && !serverIP.isEmpty()) {
            try {
                Socket socket = new Socket(serverIP, 12345);
                writer = new PrintWriter(socket.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                new Thread(this::receiveMessages).start();

                textField.addActionListener(e -> {
                    String message = textField.getText();
                    writer.println(message);
                    textField.setText("");
                });
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Connection failed!");
            }
        }
    }

    private void receiveMessages() {
        try {
            String message;
            while ((message = reader.readLine()) != null) {
                textArea.append(message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
