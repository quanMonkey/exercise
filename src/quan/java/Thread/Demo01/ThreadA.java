package quan.java.Thread.Demo01;

/**
 * Created by liuquan on 2017/7/8.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a","aa");
    }
}
