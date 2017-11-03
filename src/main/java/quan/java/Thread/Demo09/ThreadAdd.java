package quan.java.Thread.Demo09;

/**
 * Created by liuquan on 2017/8/22.
 */
public class ThreadAdd extends Thread{
    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        p.add();
    }
}
