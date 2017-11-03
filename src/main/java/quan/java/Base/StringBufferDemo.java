package quan.java.Base;

/**
 * Created by liuquan on 2017/8/14.
 */
public class StringBufferDemo {
    public static void main(String[] args){
        test3();
    }

    private static void test3(){
        StringBuffer sbf = new StringBuffer();
        sbf.append("test");
        System.out.println(sbf.toString());
    }

    private static void test2(){
        String str = "";
        long startTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            str = "测试"+"字符串"+"拼接"+"效率";
        }
        System.out.println(System.currentTimeMillis()-startTime);

        System.out.println();

        StringBuilder sbd = new StringBuilder(1000000);
        startTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            sbd.append("测试");//.append("字符串").append("拼接").append("效率");
        }
        System.out.println(System.currentTimeMillis()-startTime);

    }

    private static void test1(){

        String str = "";
//        char[] c = new char[6];
//        c[0] = 's';
//        c[1] = 'd';
//        c[2] = 'r';
//        str.getChars(0,3,c,2);
//        for(char nc : c){
//            System.out.println(nc);
//        }
        System.out.println(System.currentTimeMillis());
        for(int i=0; i<10000; i++){
            str += i;
        }
        System.out.println(System.currentTimeMillis());
        System.out.println();
        StringBuffer sbf = new StringBuffer();
        System.out.println(System.currentTimeMillis());
        for(int i=0; i<10000; i++){
            sbf.append(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(sbf.toString());
//        StringBuilder sbd = new StringBuilder();
//        System.out.println(sbd.toString());
    }
}
