package part6_synchronization.synchronized_method.static_synchronized;

public class Display {

    public static synchronized void wish(String name) {
        for(int i = 0; i < 10; i++) {
            System.out.print("Good morning: ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }

}
