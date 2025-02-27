package part1.ways.of.defining.extending.thread.restarting.same.thread;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("main method");

        t.start(); // Restarting the same thread -> throws IllegalThreadStateException
    }

}
