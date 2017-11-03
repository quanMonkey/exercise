package quan.java.Thread.Demo08;

/**
 * Created by liuquan on 2017/8/16.
 */
public class MyThreadB extends Thread{
    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodB();
        System.out.println("MyThreadB消耗时间："+(service.methodBEndTime-service.methodBStartTime));
    }
}
