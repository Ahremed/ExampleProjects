package example.Synhronize;

/**
 * Created by Vladyslav on 15.02.2016.
 */
public class Worker implements Runnable {
    @Override
    public void run() {
          for (int i=0;i<1000000;i++)
          {
              Synhron.increasNum();

          }
    }
}
