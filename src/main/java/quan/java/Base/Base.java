package quan.java.Base;

/**
 * Created by liuquan on 2017/8/5.
 */
public class Base {

        private String baseName = "base";
        static Print print = new Print("Base");
        public Base()
        {
            callName();
        }
        public void callName()
        {
            System. out. println(baseName);
        }
        static class Sub extends Base
        {
            private String baseName = "sub";
            static Print print = new Print("Sub");
            public void callName()
            {
                System. out. println (baseName) ;
            }
        }
        public static void main(String[] args)
        {
            Base b = new Sub();
        }



}
class Print{
    public Print(String str)
    {
        System.out.println(str);
    }

}