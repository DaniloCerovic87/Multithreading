package part6_synchronization.synchronized_block;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();

        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "Yuraj");

        t1.start();
        t2.start();
    }

}
