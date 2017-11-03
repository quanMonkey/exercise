package quan.java.Thread.Demo09;

/**
 * Created by liuquan on 2017/8/22.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        super.run();
        r.subtract();
    }
}
