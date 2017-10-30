package quan.java.Thread.Demo06;

/**
 * Created by liuquan on 2017/8/12.
 */
public class SynchronizedTest {

    /**
     * 锁住class对象
     */
    public void synchronizedClass() {
        synchronized (SynchronizedTest.class) {
            System.out.println("synchronizedClass start");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synchronizedClass end");
        }

    }

    /**
     * 锁住方法，lock标记打在该实力上
     */
    public synchronized void synchronizedMethod() {
        System.out.println("synchronizedMethod start");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronizedMethod end");
    }

    /**
     * 锁住静态方法，lock标记打在该实力上
     */
    public static synchronized void synchronizedStaticMethod() {
        System.out.println("synchronizedStaticMethod start");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("synchronizedStaticMethod end");
    }

    /**
     * 不会有影响，正常调用
     */
    public void synchronizedMethod2WithNosynchronized() {
        System.out.println("synchronizedMethod2WithNosynchronized  no");
    }

    /**
     * synchronizedMethod 已经锁住实例， 再加锁不成功
     */
    public void synchronizedThis1() {
        synchronized (SynchronizedTest.this) {
            System.out.println("synchronizedThis1 start");
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synchronizedThis1 end");
        }
    }

    /**
     * synchronizedMethod 已经锁住实例， 再加锁不成功
     */
    public void synchronizedThis2() {
        synchronized (this) {
            System.out.println("synchronizedThis2 start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("synchronizedThis2 end");
        }

    }

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        final SynchronizedTest t = new SynchronizedTest();
        final SynchronizedTest t1 = new SynchronizedTest();
        //调用代码看下面
//        test01(t,t1);
//        test02(t,t1);
//        test03(t,t1);
        test04(t,t1);

    }

//    synchronizedClass start
//    synchronizedThis1 start
//    synchronizedMethod2WithNosynchronized  no
//    synchronizedClass end
//    synchronizedThis1 end
    private static void test01(SynchronizedTest t,SynchronizedTest t1){
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                t.synchronizedClass();
            }

        });
        th.start();

        th = new Thread(new Runnable() {
            @Override
            public void run() {
                t.synchronizedThis1();
            }

        });
        th.start();
        t.synchronizedMethod2WithNosynchronized();
    }

//    synchronizedClass start
//    synchronizedClass end
//    synchronizedStaticMethod start
//    synchronizedStaticMethod end
    private static void test02(SynchronizedTest t,SynchronizedTest t1){
        Thread th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                t.synchronizedClass();
            }

        });
        th.start();

        th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                t.synchronizedStaticMethod();
            }

        });
        th.start();
    }

//    synchronizedThis1 start
//    synchronizedMethod2WithNosynchronized  no
//    synchronizedThis1 end
//    synchronizedThis2 start
//    synchronizedThis2 end
    private static void test03(SynchronizedTest t,SynchronizedTest t1){
        Thread th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                t.synchronizedThis1();
            }

        });
        th.start();
        t.synchronizedMethod2WithNosynchronized();

        th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                t.synchronizedThis2();
            }

        });
        th.start();
    }

//    synchronizedMethod2WithNosynchronized  no
//    synchronizedThis1 start
//    synchronizedThis1 end
//    synchronizedMethod start
//    synchronizedMethod end
    private static void test04(SynchronizedTest t,SynchronizedTest t1){
        Thread th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                t.synchronizedThis1();
            }

        });
        th.start();

        t.synchronizedMethod2WithNosynchronized();

        th = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
//               t1.synchronizedMethod();
                t.synchronizedMethod();
            }

        });
        th.start();
    }
}