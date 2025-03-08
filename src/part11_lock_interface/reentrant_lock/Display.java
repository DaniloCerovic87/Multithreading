package part11_lock_interface.reentrant_lock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {

    private ReentrantLock l = new ReentrantLock();

    public void wish(String name) {
        l.lock();
        for (int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
        l.unlock();
    }

}
