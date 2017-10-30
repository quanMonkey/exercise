package quan.java.Thread.Demo01;

/**
 * Created by liuquan on 2017/7/8.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){
        try{
            usernameRef = username;
            if("a".equals(usernameRef)){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username: "+usernameRef+"  password: "+passwordRef);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
