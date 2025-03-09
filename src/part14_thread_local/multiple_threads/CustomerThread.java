package part14_thread_local.multiple_threads;

public class CustomerThread extends Thread {
    static Integer customerId = 0;
    private static final ThreadLocal<Integer> tl = ThreadLocal.withInitial(() -> customerId);

    public CustomerThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (CustomerThread.class) {
            customerId++;
        }
        System.out.println(Thread.currentThread().getName() + " executing with customer id: " + tl.get());
    }
}
