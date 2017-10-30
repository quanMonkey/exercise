package quan.java.Thread.Demo07;

/**
 * Created by liuquan on 2017/8/13.
 */
public class MyThreadA extends Thread{
    private Services services;

    public MyThreadA(Services services) {
        this.services = services;
    }

    @Override
    public void run() {
        super.run();
        services.methodA();
//        services.methodB();
    }
}
