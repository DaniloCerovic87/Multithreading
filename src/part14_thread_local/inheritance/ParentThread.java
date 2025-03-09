package part14_thread_local.inheritance;

public class ParentThread extends Thread {

    //this class is used to allow child thread to inherit and be able to get parent thread local variable
    static InheritableThreadLocal<String> tl = new InheritableThreadLocal<>() {
        // this method is used to override child thread local value, otherwise it will be the same as parent value
        @Override
        public String childValue(String p) {
            return "CC";
        }
    };

    public void run() {
        tl.set("pp");
        System.out.println("Parent Thread Value--" + tl.get());
        ChildThread ct = new ChildThread();
        ct.start();
    }

}
