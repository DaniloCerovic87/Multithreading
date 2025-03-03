package part8_dead_lock;

public class B {

    public synchronized void d2(A a) {
        System.out.println("Thread2 starts execution of d2() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread2 trying to call A's last() method");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside B's last() method");
    }

}
