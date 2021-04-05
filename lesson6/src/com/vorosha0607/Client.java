package com.vorosha0607;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String IP_ADDRESS = "localhost";
    private static final int PORT = 8189;


    public static void main(String[] args) {
        Socket socket = null;
        Scanner scanner = new Scanner(System.in);

        try {
            socket = new Socket(IP_ADDRESS, PORT);
            System.out.println("You connected to server");
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            Thread tRead = new Thread(() -> {
                try {
                    while (true){
                        outputStream.writeUTF(scanner.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            tRead.setDaemon(true);
            tRead.start();


            while (true){
                String str = inputStream.readUTF();

                if (str.equals("/end")) {
                    System.out.println("Server disconnected");
                    outputStream.writeUTF("/end");
                    break;
                }

                System.out.println("Server wrote: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
}
