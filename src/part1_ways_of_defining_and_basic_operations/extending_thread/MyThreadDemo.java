package part1_ways_of_defining_and_basic_operations.extending_thread;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }

}
