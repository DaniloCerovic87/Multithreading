package part14_thread_local.inheritance;

public class InheritableThreadLocalDemo {

    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        pt.start();
    }

}
