package quan.java.Thread.Demo02;

/**
 * Created by liuquan on 2017/7/8.
 */
public class SellTicket {

    public static void main(String[] args){
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket);
        Thread thread1 = new Thread(ticket);
        thread.start();
        thread1.start();
    }

}
class Ticket extends Thread{
    private int count = 10;

    @Override
    public void run() {
        while(count>0){
            count--;
            System.out.println("当前票数："+count);
        }
    }
}
