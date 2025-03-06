package part1_ways_of_defining_and_basic_operations.implementing_runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }

}
