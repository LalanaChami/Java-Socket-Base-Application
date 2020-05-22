package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        TextStore store = new InMemoryTextStore();
        ServerSocket socket = new ServerSocket(5000);
        System.out.println("Created a new socket on port 5000 ");

        System.out.println("Waiting to accept new client");
        Socket client = socket.accept();
        System.out.println("Accepted a client"+ client.getInetAddress());

        Scanner inputScanner = new Scanner(client.getInputStream());
        String recivedText = inputScanner.nextLine();

        System.out.println("Recived a text from the client : "+ recivedText);
        PrintStream writer = new PrintStream(client.getOutputStream());
        writer.println("I recived yor text, thankyou");

        client.close();
        socket.close();
    }
}
