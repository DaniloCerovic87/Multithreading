package part6_synchronization.synchronized_block;

public class Display {

    public synchronized void wish(String name) {

        // many lines of the code
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
        }

        // many lines of the code

    }


}
