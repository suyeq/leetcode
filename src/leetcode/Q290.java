package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 11:02
 */
public class Q290 {

    public static void main(String []args){
        HashMap<String,String> map=new HashMap<>();
        System.out.println(map.put("q","w"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if(pattern.length() != strings.length){
            return false;
        }
        Map<Object,Integer> hashMap = new HashMap<>();
        for(int i = 0;i < pattern.length();i++){
            if(!Objects.equals(hashMap.put(pattern.charAt(i),i),hashMap.put(strings[i],i))){
                return false;
            }
        }
        return true;
    }




}
