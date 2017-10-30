package quan.java.Thread;

/**
 * Created by liuquan on 2017/7/8.
 */
public class ThreadDemo01 {
    public static void main(String[] args){
//        getCurrentThreadName();
//        testMyThread01();
//        testMyThread02();
//        testMyThread03();
//        testMyThread04();
//        testMyThread04_01();
//        testMyThread05();
//        testMyThread05_01();

            testMyThread07();


    }

    private static void testMyThread07(){
        MyThread07 myThread07 = new ThreadDemo01().new MyThread07();
        myThread07.start();
        myThread07.interrupt();
        System.out.println(myThread07.currentThread().getName());
    }

    class MyThread07 extends Thread{
        public void run(){
            for(int i=0;i<50000;i++){
                System.out.println(i+1);
            }
            System.out.println(this.isInterrupted());
            System.out.println("interrupted:"+this.interrupted());
            System.out.println(Thread.currentThread().getName());
            try{
                this.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }finally {
                System.out.println(this.isInterrupted());
                System.out.println("interrupted:"+this.isInterrupted());
            }
        }
    }



    private static void testMyThread06(){
        MyThread06 myThread06 = new ThreadDemo01().new MyThread06();
        Thread threadA = new Thread(myThread06);
        Thread threadB = new Thread(myThread06);
        Thread threadC = new Thread(myThread06);
        Thread threadD = new Thread(myThread06);
        Thread threadE = new Thread(myThread06);
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();

    }

    class MyThread06 extends Thread{
        private int count = 5;

        @Override
        public void run() {
            super.run();
            System.out.println("count:"+(count--)+"  "+Thread.currentThread().getName());
        }
    }

    private static void testMyThread05(){
        MyThread05 myThread05 = new ThreadDemo01().new MyThread05();
        Thread threadA = new Thread(myThread05,"A");
        Thread threadB = new Thread(myThread05,"B");
        Thread threadC = new Thread(myThread05,"C");
        Thread threadD = new Thread(myThread05,"D");
        Thread threadE = new Thread(myThread05,"E");
        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
    }

    /**
     * 数据不共享，是否加synchronized对结果无影响
     */
    private static void testMyThread05_01(){
        MyThread05 myThreadA = new ThreadDemo01().new MyThread05("A");
        MyThread05 myThreadB = new ThreadDemo01().new MyThread05("B");
        MyThread05 myThreadC = new ThreadDemo01().new MyThread05("C");
        MyThread05 myThreadD = new ThreadDemo01().new MyThread05("D");
        MyThread05 myThreadE = new ThreadDemo01().new MyThread05("E");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
        myThreadD.start();
        myThreadE.start();
    }

    class MyThread05 extends Thread{
        private int count = 5;

        public MyThread05(){
            super();
        }

        public MyThread05(String name){
            super();
            this.setName(name);
        }

        @Override
        synchronized public void run() {
            super.run();
//            for(;count>0;){  //多线程环境中加锁的方法使用循环后将一个线程执行完，其它线程得不到执行的机会
                count--;
                System.out.println(Thread.currentThread().getName()+" : "+count);
//            }
        }
    }

    /**
     * 每个线程使用单独的对象，则对象内部的实例变量不共享数据
     */
    private static void testMyThread04(){
        MyThread04 myThreadA = new ThreadDemo01().new MyThread04("ThreadA");
        MyThread04 myThreadB = new ThreadDemo01().new MyThread04("ThreadB");
        MyThread04 myThreadC = new ThreadDemo01().new MyThread04("ThreadC");
        myThreadA.start();
        myThreadB.start();
        myThreadC.start();
    }

    /**
     * 每个线程使用同一个对象，则对象内部的实例变量为共享数据，会存在线程不安全的隐患
     */
    private static void testMyThread04_01(){
        MyThread04 myThreado04 = new ThreadDemo01().new MyThread04();
        Thread treadA = new Thread(myThreado04,"a");
        Thread treadB = new Thread(myThreado04,"b");
        Thread treadC = new Thread(myThreado04,"c");
        treadA.start();
        treadB.start();
        treadC.start();
    }

    class MyThread04 extends Thread{

        private int count = 5;

        public MyThread04(){super();}

        public MyThread04(String name){
            super();
            this.setName(name);
        }

        @Override
        public void run() {
            super.run();
            //while(count>0){
            for(;count>0;){
                count--;
                System.out.println(Thread.currentThread().getName()+" : "+count);
            }
        }
    }

    /**
     * start()方法的顺序不代表线程启动的顺序
     */
    private static void testMyThread03(){
        MyThread03 th1 = new ThreadDemo01().new MyThread03(1);
        MyThread03 th2 = new ThreadDemo01().new MyThread03(2);
        MyThread03 th3 = new ThreadDemo01().new MyThread03(3);
        MyThread03 th4 = new ThreadDemo01().new MyThread03(4);
        MyThread03 th5 = new ThreadDemo01().new MyThread03(5);
        MyThread03 th6 = new ThreadDemo01().new MyThread03(6);
        MyThread03 th7 = new ThreadDemo01().new MyThread03(7);
        MyThread03 th8 = new ThreadDemo01().new MyThread03(8);
        MyThread03 th9 = new ThreadDemo01().new MyThread03(9);
        MyThread03 th10 = new ThreadDemo01().new MyThread03(10);
        MyThread03 th11 = new ThreadDemo01().new MyThread03(11);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        th11.start();
    }

    class MyThread03 extends Thread{
        private int i;
        public MyThread03(){}

        public MyThread03(int i){
            super();
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println(i);
        }
    }

    private static void getCurrentThreadName(){
        System.out.println(Thread.currentThread().getName());
    }

    private static void testMyThread01(){
        MyThread01 myThread = new ThreadDemo01().new MyThread01();
        myThread.start();
        System.out.println("运行结束！");
    }

    class MyThread01 extends Thread{

        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }


    private static void testMyThread02(){
        MyThread02 myThread02 = new ThreadDemo01().new MyThread02();
        myThread02.setName("MyThread02");
        myThread02.start();
        treadSleep01();

    }

    private static void treadSleep01(){
        try{
            int time = 0;
            for(int i=0; i<10; i++){
                time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println(Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    class MyThread02 extends Thread{
        @Override
        public void run() {
         treadSleep01();
        }
    }

}
