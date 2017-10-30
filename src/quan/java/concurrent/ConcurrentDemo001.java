package quan.java.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liuquan on 2017/7/14.
 */
public class ConcurrentDemo001 {
    public static void main(String[] args){
        ConcurrentHashMap<String,String> conHashMap = new ConcurrentHashMap<String,String>(200);
        conHashMap.put("test","demo");
        String strValue = conHashMap.get("test");

    }
}
