package quan.java.Thread;

import org.hibernate.dialect.MySQLDialect;

/**
 * Created by liuquan on 2017/7/16.
 */
public class Run {
    public static void main(String[] args){
        try{
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.suspend();
            System.out.println("main end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

class MyThread extends Thread{
    private long i = 0;

    @Override
    public void run() {
        while(true){
            i++;
        }
    }
}
