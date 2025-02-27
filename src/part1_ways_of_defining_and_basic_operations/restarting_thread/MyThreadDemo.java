package part1_ways_of_defining_and_basic_operations.restarting_thread;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("main method");

        t.start(); // Restarting the same thread -> throws IllegalThreadStateException
    }

}
