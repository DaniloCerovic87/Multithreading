package part8_dead_lock;

public class DeadLock extends Thread {

    A a = new A();
    B b = new B();

    public void m1() {
        this.start();
        a.d1(b); // this line is executed by Main Thread
    }

    @Override
    public void run() {
        b.d2(a); // this line is executed by Child Thread
    }

    public static void main(String[] args) {
        DeadLock t = new DeadLock();
        t.m1();
    }

}


