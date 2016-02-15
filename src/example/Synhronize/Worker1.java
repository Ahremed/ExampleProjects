package example.Synhronize;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Vladyslav on 15.02.2016.
 */
public class Worker1 implements Runnable {
    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();
    private Object ob1 = new Object();
    private Object ob2 = new Object();
    private Random r = new Random();

    private void partOne(){
        synchronized (list1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(r.nextInt(100));
        }

    }
    private void partTwo(){
        synchronized (list2) {
            try {

                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list2.add(r.nextInt(100));

        }
    }
    private void proceed(){
        for (int i = 0;i< 1000;i++)
        {
            partOne();
            partTwo();
        }
    }
    public void start(){
        System.out.println("Start...");
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                proceed();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time ="+ (endTime-startTime)+"\n" +
                "List1 = " + list1.size()+"\n" +
                " List2 = " + list2.size());
    }

    @Override
    public void run() {

    }
}
