package part2.thread.priorities;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }

}
