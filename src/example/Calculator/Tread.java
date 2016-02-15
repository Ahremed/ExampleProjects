package example.Calculator;

import example.Synhronize.Worker;

/**
 * Created by Vladyslav on 13.02.2016.
 */
public class Tread {


    public static void main (String [] args)
    {
        Thread t1 = new Thread(new Tre1("1"));
        Thread t2 = new Thread(new Tre1("2"));
        Thread t3 = new Thread(new Tre1("3"));
        t1.start();
        t2.start();
        t3.start();
    }
}
