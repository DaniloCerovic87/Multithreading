package part11_lock_interface.lock_example;

public class ReentrantLockDemo {

    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Dhoni");
        MyThread t2 = new MyThread(d, "YuvRaj");

        t1.start();
        t2.start();
    }

}
