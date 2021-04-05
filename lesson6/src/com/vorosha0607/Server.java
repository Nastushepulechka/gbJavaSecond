package com.vorosha0607;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server;
    private static final int PORT = 8189;


    public static void main(String[] args) {
        Socket clientSocket = null;
        Scanner scanner = new Scanner(System.in);


        try {
            server = new ServerSocket(PORT);
            System.out.println("Server started");

            clientSocket = server.accept();
            System.out.println("Client connected");

            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());

            Thread t1 = new Thread(() -> {
                try {
                    while (true){
                        outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            t1.setDaemon(true);
            t1.start();

            while (true){
                String str = inputStream.readUTF();
                if (str.equals("/end")){
                    System.out.println("Client disconnected");
                    outputStream.writeUTF("/end");
                    break;
                }
                System.out.println("Client wrote: " + str);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                clientSocket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }

    }
}
