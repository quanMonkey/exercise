package quan.java.Thread.Demo01;

/**
 * Created by liuquan on 2017/7/8.
 */
public class TestThread {
    public static void main(String[] args){
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();
    }
}
