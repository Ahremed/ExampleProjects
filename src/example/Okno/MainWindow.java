package example.Okno;

import javax.swing.*;

/**
 * Created by Vladyslav on 19.02.2016.
 */
public class MainWindow extends JFrame{
    public MainWindow (int wigth,int heigth)
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(wigth,heigth);
        setVisible(true);

    }
}
