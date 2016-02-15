package example.Synhronize;



/**
 * Created by Vladyslav on 15.02.2016.
 */
public class Synhron {
    private static int num;
    public static void main (String[] args){
        Thread t1 = new Thread(new Worker());
        Thread t2 = new Thread(new Worker());
        Thread t3 = new Thread(new Worker());
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num);
    }

    public synchronized static void increasNum(){
        num++;
    }
}
