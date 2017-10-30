package quan.java.Thread.Demo03;

/**
 * Created by liuquan on 2017/7/29.
 */
public class ThreadTest {
    public static void main(String[] args){
        ThreadDemo t1 = new ThreadTest().new ThreadDemo();
        ThreadDemo t2 = new ThreadTest().new ThreadDemo();
        ThreadDemo t3 = new ThreadTest().new ThreadDemo();
        ThreadDemo t4 = new ThreadTest().new ThreadDemo();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    class ThreadDemo extends Thread{
        @Override
        public void run() {
//            System.out.println(Singleton.getInstance().hashCode());
           try {
               System.out.println(Singleton.class.newInstance().hashCode());
           }catch (IllegalAccessException e){
               e.printStackTrace();
           }catch (InstantiationException e){
               e.printStackTrace();
           }
        }
    }
}
