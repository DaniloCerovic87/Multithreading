package part6_synchronization.synchronized_method;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "YuvRaj");
        MyThread t3 = new MyThread(d, "Kohli");
        MyThread t4 = new MyThread(d, "Raina");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
