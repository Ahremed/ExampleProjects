package example.CliServ;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Vladyslav on 14.02.2016.
 */
public class Server implements Runnable {
    static Socket connect;
    static ObjectOutputStream output;
    static ObjectInputStream input;
    static ServerSocket server;
    @Override
    public void run() {
        try {
            server = new ServerSocket(5678,10);
            while(true)
            {
               connect = server.accept();
                output = new ObjectOutputStream(connect.getOutputStream());
                input = new ObjectInputStream(connect.getInputStream());

                output.writeObject("You write = "+(String)input.readObject());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){}
    }
}
