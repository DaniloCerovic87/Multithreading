package part5_sleep_method.interruption;

public class ThreadInterruptDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        t.interrupt();

        System.out.println("End of Main Thread");
    }

}
