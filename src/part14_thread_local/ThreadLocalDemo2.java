package part14_thread_local;

public class ThreadLocalDemo2 {

    public static void main(String[] args) {
        ThreadLocal<String> tl = ThreadLocal.withInitial(() -> "abc");
        System.out.println(tl.get()); //null
        tl.set("durga");
        System.out.println(tl.get()); //durga
        tl.remove();
        System.out.println(tl.get()); //null - initialValue() is invoked
    }

}
