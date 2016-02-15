package example.Calculator;
import java.util.Random;

/**
 * Created by Vladyslav on 13.02.2016.
 */
public class Tre1 implements Runnable {

    int time;
    String name;
    Random r = new Random();
    public Tre1(String name)
    {
     this.name = name;
        time = r.nextInt(1000);
    }

    @Override
    public void run() {
      System.out.printf("Tread %s sleep %d ms\n",name,time);
        try {
            Thread.sleep(time);
        }
        catch (Exception x)     {      }
        System.out.printf("Thread %s wake up, and finished\n",name);
    }
}
