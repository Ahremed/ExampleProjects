package example.Calculator;
import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Vladyslav on 13.02.2016.
 */
public class Net extends JFrame implements Runnable {
    static Socket connect;
    static ObjectOutputStream output;
    static ObjectInputStream input;
    public static void main(String[] args)
    {

    }

    @Override
    public void run() {
        try {
            connect = new Socket(InetAddress.getByName("127.0.0.1"),5678);
            while(true)
            {
                output = new ObjectOutputStream(connect.getOutputStream());
                input = new ObjectInputStream(connect.getInputStream());

                    JOptionPane.showMessageDialog(null, input.readObject());
            }
            }
         catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){}
    }

    public static void sendData(Object o)
    {
        try {
            output.flush();
            output.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
