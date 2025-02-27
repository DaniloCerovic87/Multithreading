package part1.ways.of.defining.implementing.runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("child Thread");
        }
    }

}
