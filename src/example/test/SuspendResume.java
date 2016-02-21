package example.test;

/**
 * Created by Vladyslav on 21.02.2016.
 */
public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");

        try{
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Pause thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resume thread One");
            ob2.mysuspend();
            System.out.println("Pause thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resume thread Two");
        }
        catch(InterruptedException e){}
        try{
            System.out.println("Wait for finished threads");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){}
        System.out.println("Main thread was finished");
    }
}
