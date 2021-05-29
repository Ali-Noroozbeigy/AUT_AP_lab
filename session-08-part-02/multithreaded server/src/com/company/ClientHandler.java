package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ClientHandler class to send and receive message from clients
 *
 * @author Ali Noroozbeigy
 * @version 1
 */
public class ClientHandler extends Thread {

    private Socket client;

    public ClientHandler (Socket client)
    {
        this.client = client;
    }

    /**
     * run method for sending and receiving message
     */
    @Override
    public void run ()
    {
        try {
            OutputStream output = client.getOutputStream();
            InputStream input = client.getInputStream();

            byte[] buffer = new byte[2048];

            String whlMsg = "";
            String msg = "";

            output.write("to finish type over".getBytes());

            while (true)
            {
                int read = input.read(buffer);

                msg = new String(buffer,0,read);

                if (msg.equals("over"))
                    break;

                output.write("received\n".getBytes());

                msg +=" ";

                whlMsg += msg;

                output.write(whlMsg.getBytes());
            }
            output.write("whole words : \n".getBytes());
            output.write(whlMsg.getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            try {

                client.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }



    }

}
