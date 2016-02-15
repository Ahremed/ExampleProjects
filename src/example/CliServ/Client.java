package example.CliServ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Vladyslav on 13.02.2016.
 */
public class Client extends JFrame implements Runnable {
    static Socket connect;
    static ObjectOutputStream output;
    static ObjectInputStream input;

    public static void main(String[] args)
    {
     new Thread(new Client("Test")).start();
        new Thread(new Server()).start();
    }

    public Client(String name)
    {
        super(name);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JTextField t1 = new JTextField(10);
        JButton b1 = new JButton("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1)
                {
                    sendData(t1.getText());
                }
            }
        });
        add(t1);
        add(b1);
    }

    @Override
    public void run() {
        try {

            while(true)
            {
                connect = new Socket(InetAddress.getByName("126.0.0.1"),5678);
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