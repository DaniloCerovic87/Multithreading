package part11_lock_interface.try_lock_example;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static ReentrantLock l = new ReentrantLock();

    private String name;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
       if(l.tryLock()) {
           System.out.println(Thread.currentThread().getName() + "...got lock and performing safe operations");
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
           }
           l.unlock();
       } else {
           System.out.println(Thread.currentThread().getName() +
                   "...unable to get lock and hence performing alternative operations");
       }
    }

}
