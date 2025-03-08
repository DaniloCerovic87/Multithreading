package part14_thread_local;

public class ThreadLocalDemo1 {

    public static void main(String[] args) {
        ThreadLocal<String> tl = new ThreadLocal<>();
        System.out.println(tl.get()); //null
        tl.set("durga");
        System.out.println(tl.get()); //durga
        tl.remove();
        System.out.println(tl.get()); //null - initialValue() is invoked
    }

}
