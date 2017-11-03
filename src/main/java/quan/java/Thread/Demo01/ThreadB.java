package quan.java.Thread.Demo01;

/**
 * Created by liuquan on 2017/7/8.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b","bb");
    }
}
