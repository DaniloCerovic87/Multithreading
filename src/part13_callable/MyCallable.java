package part13_callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private final int num;

    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() {
        System.out.println(Thread.currentThread().getName() +
                " is...responsible to find sum of first " + num + " numbers");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

}
