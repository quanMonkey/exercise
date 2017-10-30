package quan.java.Thread.Demo07;

import quan.java.Thread.Demo05.MyThread;

/**
 * Created by liuquan on 2017/8/13.
 */
public class Run {
    public static void main(String[] args){
        Services servicesA = new Services();
        Services servicesB = new Services();
        MyThreadA myThreadA = new MyThreadA(servicesA);
        MyThreadB myThreadB = new MyThreadB(servicesB);
        myThreadA.start();
        myThreadB.start();
    }
}
