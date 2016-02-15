package example.Calculator;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by Vladyslav on 13.02.2016.
 */
public class WrFile  {
    static Formatter f;
    static Scanner scr;
    public static void main (String[] args)
    {
        try
        {
          f = new Formatter("res//2.txt");
            scr = new Scanner(System.in);
            System.out.println("How old are you?");
            int a = Integer.parseInt(scr.next());
            System.out.println("What is your name?");
            String b = scr.next();
            f.format("My name %s. I am %d years old",b,a);
            f.close();
        }
        catch (Exception x){}
    }
}
