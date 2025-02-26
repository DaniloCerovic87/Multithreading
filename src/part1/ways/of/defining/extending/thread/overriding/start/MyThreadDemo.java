package part1.ways.of.defining.extending.thread.overriding.start;

public class MyThreadDemo {

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        System.out.println("main method");
    }

}
