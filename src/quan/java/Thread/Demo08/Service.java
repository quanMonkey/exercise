package quan.java.Thread.Demo08;

import java.util.ArrayList;

/**
 * Created by liuquan on 2017/8/16.
 */
public class Service {

    public void methodC(ArrayList list) {
        synchronized (this) {
            // do something
        }

        synchronized (Service.class) {
            // do something
        }

        synchronized (list) {
            // do something
        }

        synchronized (ArrayList.class) {
            // do something
        }
    }


    public long methodAStartTime;
    public long methodAEndTime;
    public long methodBStartTime;
    public long methodBEndTime;
    private String threadName;

    synchronized public void methodA(){
        System.out.println("==========methodA  start");
        methodAStartTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadName = Thread.currentThread().getName();
        methodAEndTime = System.currentTimeMillis();
        System.out.println(threadName+"==========methodA  end");
    }

    synchronized public void methodB(){
        System.out.println("==========methodB  start");

        methodBStartTime = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadName = Thread.currentThread().getName();
        methodBEndTime = System.currentTimeMillis();
        System.out.println(threadName+"==========methodB end");
    }


}
