package part1_ways_of_defining_and_basic_operations.extending_thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }

}
