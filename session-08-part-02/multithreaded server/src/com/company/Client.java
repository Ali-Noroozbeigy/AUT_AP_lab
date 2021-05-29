package com.company;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Client class which allows client to connect to server
 *
 * @author Ali Noroozbeigy
 * @version 1
 */
public class Client {

    public static void main (String[] args)
    {
        try (Socket client = new Socket("127.0.0.1",7360))
        {
            System.out.println("connected to server!");
            OutputStream os = client.getOutputStream();
            InputStream is = client.getInputStream();

            Scanner scanner = new Scanner(System.in);
            byte[] buffer = new byte[2048];

            String msg;
            int read;

            read = is.read(buffer);
            System.out.println(new String(buffer,0,read));
            while (true)
            {

                msg = scanner.nextLine();
                os.write(msg.getBytes());

                if (msg.equals("over"))
                    break;

                read = is.read(buffer);
                System.out.println(new String(buffer,0,read));

                read = is.read(buffer);
                System.out.println(new String(buffer,0,read));

            }

            read = is.read(buffer);
            System.out.println(new String(buffer,0,read));

            read = is.read(buffer);
            System.out.println(new String(buffer,0,read));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
