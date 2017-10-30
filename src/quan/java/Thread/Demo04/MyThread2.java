package quan.java.Thread.Demo04;

/**
 * Created by liuquan on 2017/8/12.
 */
public class MyThread2 extends Thread{
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
