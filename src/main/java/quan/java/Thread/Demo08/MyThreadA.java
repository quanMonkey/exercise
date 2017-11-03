package quan.java.Thread.Demo08;

/**
 * Created by liuquan on 2017/8/16.
 */
public class MyThreadA extends Thread{
    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.methodA();
        System.out.println("MyThreadA消耗时间:"+(service.methodAEndTime-service.methodAStartTime));
    }
}
