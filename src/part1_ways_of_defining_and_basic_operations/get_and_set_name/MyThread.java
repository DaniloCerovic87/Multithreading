package part1_ways_of_defining_and_basic_operations.get_and_set_name;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run method executed by Thread: " + Thread.currentThread().getName());
    }

}
