package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server class for starting and handling client
 *
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Server {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(7360))
        {
            System.out.println("Server started!...");

            int count = 0;

            while (count != 3)
            {
                Socket client = server.accept();
                System.out.println("new client accepted!");
                new ClientHandler(client).start();
                count++;
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }
}
