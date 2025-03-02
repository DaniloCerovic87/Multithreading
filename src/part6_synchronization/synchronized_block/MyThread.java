package part6_synchronization.synchronized_block;

public class MyThread extends Thread {

    private Display d;
    private String name;

    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }

}
