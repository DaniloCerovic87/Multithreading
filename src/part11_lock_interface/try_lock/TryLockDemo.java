package part11_lock_interface.try_lock;

public class TryLockDemo {

    public static void main(String[] args) {
        MyThread t1 = new MyThread("First Thread");
        MyThread t2 = new MyThread("Second Thread");

        t1.start();
        t2.start();
    }

}
