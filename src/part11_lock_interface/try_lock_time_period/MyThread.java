package part11_lock_interface.try_lock_time_period;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static ReentrantLock l = new ReentrantLock();

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        do {
            try {

                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "...got lock");
                    Thread.sleep(30000);
                    System.out.println(Thread.currentThread().getName() + "...releases the lock");
                    l.unlock();
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() +
                            "...unable to get lock and will try again");
                }
            } catch (InterruptedException e) {
            }
        } while (true);
    }

}
