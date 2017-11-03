package quan.java.Thread.Demo07;

/**
 * Created by liuquan on 2017/8/13.
 */
public class Services {
    //锁的是类，同一个类有效
    synchronized public static void methodA(){
        System.out.println("======methodA start========"+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("======methodA end ========"+Thread.currentThread().getName());
    }

    //锁的是对象，同一个对象有效
    synchronized public void methodB(){
        System.out.println("======methodB start========"+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("======methodB end ========"+Thread.currentThread().getName());
    }

    synchronized public static void methodC(){
        System.out.println("======methodC start========"+Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("======methodC end ========"+Thread.currentThread().getName());
    }
}
