package part5_sleep_method;

public class SlideRotator {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Slide-" + i);
            Thread.sleep(1000);
        }

    }
}
