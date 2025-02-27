package part1.ways.of.defining.extending.thread.restarting.same.thread;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }

}
