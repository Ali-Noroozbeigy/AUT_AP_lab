package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try (ServerSocket server = new ServerSocket(8080))
        {
            System.out.println("waiting for a client ...");
            try (Socket client = server.accept())
            {
                System.out.println("client accepted!");
                OutputStream os = client.getOutputStream();
                InputStream is = client.getInputStream();

                String complete = "";

                int read;
                byte[] buffer = new byte[2048];

                os.write("type over to finish\n".getBytes());

                while (true)
                {
                    read = is.read(buffer);
                    String msg = new String(buffer,0,read);
                    if (msg.equals("over"))
                        break;

                    os.write("received\n".getBytes());
                    complete +=" ";
                    complete += msg;

                }

                os.write("whole words : \n".getBytes());
                os.write(complete.getBytes());

            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
