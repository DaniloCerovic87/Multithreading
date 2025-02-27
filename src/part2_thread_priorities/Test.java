package part2_thread_priorities;

public class Test {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(15); RE: IllegalArgumentException
        Thread.currentThread().setPriority(7);
        MyThread t = new MyThread();
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
        t.start();

        for(int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }

}
