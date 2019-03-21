package suyeq;

import java.net.StandardSocketOptions;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-21
 * @time: 12:31
 */
public class Q9 {
    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String isNeed=x+"";
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=isNeed.length()-1;i>=0;i--){
            stringBuilder.append(isNeed.charAt(i));
        }
        if (stringBuilder.toString().equals(isNeed)){
            return true;
        }
        return false;
    }
}
