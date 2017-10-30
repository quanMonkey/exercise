package quan.java.Base;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by liuquan on 2017/8/2.
 */
public class StringDemo {

    public static void main(String[] args){

        String testS = ",,!2.? 3  4";
        testS = testS.replace(","," ").replace("!"," ")
                .replace("."," ").replace("?","");
//        System.out.println(testS);
        testS = testS.replaceAll(" +"," ");
        testS = testS.trim();
//        System.out.println(testS);
        String[] testArray = testS.split(" ");
        for(String testStr : testArray){
            System.out.println(testStr);
        }



        String s = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Reprehenderit dicta eveniet perferendis" +
                " molestiae quasi consectetur, corporis omnis quas voluptatibus consequatur explicabo, aut nulla" +
                " inventore iusto voluptatem eaque, hic sint doloribus repudiandae, ea voluptatum quibusdam. Illum" +
                " velit corporis, quibusdam, beatae, laborum vel deleniti molestiae sit alias sed, placeat ipsam" +
                " cupiditate. Esse magni quam laudantium similique cum ratione quia, voluptatem animi nobis" +
                " molestias labore aspernatur perferendis quidem omnis quasi minima adipisci laboriosam nihil!" +
                " Atque corrupti molestias, dolorum eos quas rem fugit exercitationem facere laudantium" +
                " ea inventore dolorem, aliquid illum aperiam. Maiores sit officia temporibus mollitia aliquam" +
                " fugiat, consectetur iusto fuga perspiciatis repudiandae .et..";

        String[] strArray = s.split(", |\\. |! | \\.|\\.\\.| ");

        Map<String,Integer> wordMap = new HashMap<String,Integer>(100);
        int frequency = 0;

        for(String str : strArray){
            if(wordMap.containsKey(str)){
                frequency = wordMap.get(str);
                frequency++;
                wordMap.put(str,frequency);
            }else{
                wordMap.put(str,1);
            }
        }

        Iterator<Map.Entry<String,Integer>> iterator = wordMap.entrySet().iterator();
        Map.Entry entry = null;
        while(iterator.hasNext()){
            entry = iterator.next();
            System.out.println("\""+entry.getKey()+"\""+":"+entry.getValue());
        }

    }
}
