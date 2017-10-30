package quan.java.Base;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuquan on 2017/8/4.
 */
public class StringDemo01 {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,String> obj = new HashMap<String,String>();
        obj.put("action_obj","A");
        map.put("action_map",obj);

        test(map);
        Map<String,String> n = (Map<String,String>)map.get("action_map");
        System.out.println(n.get("action_obj"));
    }



    public static void test(final Map<String,Object> map){
        Map<String,String> obj = (Map<String,String>)map.get("action_map");
        obj.put("action_obj","B");
    }
}
