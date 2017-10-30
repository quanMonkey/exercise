package quan.java.Thread.Demo08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuquan on 2017/8/16.
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        MyThreadA threadA = new MyThreadA(service);
        MyThreadB threadB = new MyThreadB(service);
        threadA.start();
        threadB.start();
    }
}
