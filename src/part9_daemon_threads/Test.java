package part9_daemon_threads;

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon()); // false
//      Thread.currentThread().setDaemon(true); -> RE: IllegalThreadStateException
        MyThread t = new MyThread();
        System.out.println(t.isDaemon()); // false
        t.setDaemon(true);
        System.out.println(t.isDaemon()); // true
        t.start();
        System.out.println("End of Main Thread");
    }

}
