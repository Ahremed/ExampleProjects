package example.Calculator;
import javax.swing.*;

/**
 * Created by Vladyslav on 04.02.2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Frame f = new Frame("Calculator");
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setSize(180,280);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
