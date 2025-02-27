package part1.ways.of.defining.extending.thread.name;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run method executed by Thread: " + Thread.currentThread().getName() );
    }

}
