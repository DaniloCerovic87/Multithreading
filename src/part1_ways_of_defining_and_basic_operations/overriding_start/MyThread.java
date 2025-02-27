package part1_ways_of_defining_and_basic_operations.overriding_start;

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
