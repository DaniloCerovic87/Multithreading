package part4_join_method.child_thread_join;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread.mainThread = Thread.currentThread();

        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }

    }
}
