package part4_join_method.child_thread_join;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread.mainThread = Thread.currentThread();

//        Thread.currentThread().join(); causes form of a deadlock

        MyThread t = new MyThread();
        t.start();

//        t.join(); causes form of a deadlock

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }

    }
}
