package part3_yield_method;

import part2_thread_priorities.MyThread;

public class ThreadYieldDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }

}
