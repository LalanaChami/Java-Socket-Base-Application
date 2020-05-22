package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket s = new Socket("192.168.1.102",5000);

        PrintStream writer = new PrintStream(s.getOutputStream());
        writer.println("Hey this is the client text");
        writer.flush();

        Scanner scanner = new Scanner(s.getInputStream());
        System.out.println("Message from server : "+scanner.nextLine());
        
        Thread.sleep(15000);
    }
} 

