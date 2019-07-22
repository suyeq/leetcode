package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 15:41
 */
public class Q205 {

    /**
     * 输入: s = "egg", t = "add"
     * 输出: true
     * s = "paper", t = "title"
     * @param args
     */
    public static void main(String []args){
        System.out.println(isIsomorphic("paper","title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> sMap=new HashMap<>();
        Map<Character,Integer> tMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!Objects.equals(sMap.put(s.charAt(i),i),tMap.put(t.charAt(i),i))){
                return false;
            }
        }
        return true;
    }


}
