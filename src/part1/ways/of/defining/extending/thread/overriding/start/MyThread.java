package part1.ways.of.defining.extending.thread.overriding.start;

public class MyThread extends Thread {

    @Override
    public void start() {
        super.start();
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }

}
