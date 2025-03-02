package part7_interthread_communication;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            System.out.println("Main thread trying to call wait() method");
            b.wait();
            System.out.println("Main thread got notification");
            System.out.println(b.total);
        }
    }

}
