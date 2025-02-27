package part1_ways_of_defining_and_basic_operations.overriding_start;

public class MyThreadDemo {

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        System.out.println("main method");
    }

}
