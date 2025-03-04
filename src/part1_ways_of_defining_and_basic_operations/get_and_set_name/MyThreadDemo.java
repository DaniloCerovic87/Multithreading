package part1_ways_of_defining_and_basic_operations.get_and_set_name;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        System.out.println("main method executed by Thread: " + Thread.currentThread().getName());
        Thread.currentThread().setName("New-name");
        System.out.println(Thread.currentThread().getName());
    }

}
