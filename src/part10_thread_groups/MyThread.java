package part10_thread_groups;

public class MyThread extends Thread {


    public MyThread(ThreadGroup pg, String name) {
        super(pg, name);
    }

    @Override
    public void run() {
        System.out.println("Executing: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
    }

}
