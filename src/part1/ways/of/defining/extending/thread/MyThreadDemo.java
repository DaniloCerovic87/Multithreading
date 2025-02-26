package part1.ways.of.defining.extending.thread;

public class MyThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main Thread");
        }

    }

}
