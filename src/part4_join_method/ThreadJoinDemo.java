package part4_join_method;

public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        t.join();
//        t.join(10000);

        for(int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }

    }
}
