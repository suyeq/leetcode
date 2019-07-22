package leetcode;

import java.util.Arrays;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 9:21
 */
public class Q242 {

    /**
     * 输入: s = "anagram", t = "nagaram"
     * 输出: true
     * @param args
     */
    public static void main(String[] args){
        String s="cat";
        String t="tar";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int [] free=new int[256];
        for (int i=0;i<s.length();i++){
            free[s.charAt(i)]++;
        }
        for (int i=0;i<t.length();i++){
            free[t.charAt(i)]--;
        }
        for (int i=0;i<free.length;i++){
            if (free[i] != 0){
                return false;
            }
        }
        return true;
    }

}
