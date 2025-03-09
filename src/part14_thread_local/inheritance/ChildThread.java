package part14_thread_local.inheritance;

public class ChildThread extends Thread {

    @Override
    public void run() {
        System.out.println("Child Thread Value--" + ParentThread.tl.get());
    }

}
