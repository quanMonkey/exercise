package quan.java.Thread.Demo03;

/**
 * Created by liuquan on 2017/7/29.
 */
public class Singleton {
    private static class Holder{
        private static Singleton singleton = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance(){
        return Holder.singleton;
    }
}
