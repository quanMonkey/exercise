package quan.java.Base;

/**
 * Created by liuquan on 2017/8/5.
 */
public class TestClassLoadOrder extends Parent{
    final static Integer order = 2;
    static int count;
    String name;

    //代码块
    {
        System.out.println("========TestClassLoadOrder代码块============start");
        System.out.println(count);
        System.out.println(name);
        count = 1;
        name = "TestClassLoadOrder";
        System.out.println("========TestClassLoadOrder码块============end");
    }

    //静态代码块
    static {
        System.out.println("========TestClassLoadOrder静态代码块============start");
        System.out.println(count);
        count = 2;
        System.out.println("========TestClassLoadOrder静态代码块============end");
    }

    //构造函数
    public TestClassLoadOrder(){
//         super();
        System.out.println("========TestClassLoadOrder造函数============start");
        System.out.println(count);
        System.out.println(name);
        count = 3;
        name = "TestClassLoadOrder()";
        System.out.println("========TestClassLoadOrder造函数============end");
    }

    public static void main(String[] args){
        //TestClassLoadOrder test = new TestClassLoadOrder();
        Parent parent = new TestClassLoadOrder();
        System.out.println("======main======="+parent.name);
    }


}

class Parent{
     final static Integer  order = 1;
    //类变量
     static int count;

    //实例变量
     String name;

    //代码块
    {
        System.out.println("========parent代码块============start");
        System.out.println(count);
        System.out.println(name);
        count = 1;
        name = "parent";
        System.out.println("========parent代码块============end");
    }

    //静态代码块
    static {
        System.out.println("========parent静态代码块============start");
        System.out.println(count);
        count = 2;
        System.out.println("========parent静态代码块============end");
    }

    //构造函数
    public Parent(){
        System.out.println("========parent构造函数============start");
        System.out.println(count);
        System.out.println(name);
        count = 3;
        name = "parent()";
        System.out.println("========parent构造函数============end");
    }


}
