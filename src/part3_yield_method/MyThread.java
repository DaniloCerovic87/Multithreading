package part3_yield_method;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
            Thread.yield();
        }
    }

}
