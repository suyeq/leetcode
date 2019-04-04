package suyeq;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-02
 * @time: 15:50
 */
public class Q20 {
    public static void main(String[] args){
        System.out.println(isValid("{}"));
    }
/**
 * ()[]{}
 * 利用栈来实现
 */
    public static boolean isValid(String s) {
        int length=s.length();
        if (length%2!=0){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<length;i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
                if (i==length-1){
                    return false;
                }
            }else {
                if (s.charAt(i)==')' && (stack.size()==0 || stack.pop()!='(')){
                    return false;
                }
                if (s.charAt(i)==']' && (stack.size()==0 || stack.pop()!='[')){
                    return false;
                }
                if (s.charAt(i)=='}' && (stack.size()==0 || stack.pop()!='{')){
                    return false;
                }
            }
        }
        return true;
    }
}
