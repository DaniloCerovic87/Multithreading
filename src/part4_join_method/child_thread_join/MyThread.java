package part4_join_method.child_thread_join;

public class MyThread extends Thread {

    static Thread mainThread;

    @Override
    public void run() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }

}
