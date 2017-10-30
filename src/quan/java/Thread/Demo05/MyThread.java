package quan.java.Thread.Demo05;

/**
 * Created by liuquan on 2017/8/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        Services services = new Services();
        services.methodA();
    }
}
