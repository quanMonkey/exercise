package quan.java.Thread.Demo09;


import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by liuquan on 2017/8/22.
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }

    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
//            lock.notifyAll();
//            ArrayBlockingQueue
        }
    }
}
