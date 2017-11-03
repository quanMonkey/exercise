package quan.java.Thread.Demo05;

/**
 * Created by liuquan on 2017/8/12.
 */
public class Services {
    synchronized public static void methodA(){
        System.out.println("methodA");
        new Services().methodB();
    }

    synchronized public void methodB(){
        System.out.println("methodB");
        methodC();
    }

    synchronized public void methodC(){
        System.out.println("methodC");

    }
}
