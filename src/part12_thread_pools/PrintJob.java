package part12_thread_pools;

public class PrintJob implements Runnable {

    private final String name;

    public PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "...Job Started by Thread" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println(name + "...Job completed by Thread" + Thread.currentThread().getName());
    }
}
