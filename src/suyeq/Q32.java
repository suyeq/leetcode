package suyeq;

import java.util.Stack;

/**
 * @author: 苍术
 * @date: 2019-07-12
 * @time: 20:06
 */
public class Q32 {

    /**
     * )()())
     * @return
     */

    public static void main(String[] args){
        String s=")()())";
        System.out.println(longestValidParentheses(s));
    }

    /**
     * 暴力法
     * @param s
     * @return
     */
    public static int longestValidParentheses(String s){
        int maxLength=0;
        for (int i=0;i<s.length();i++){
            for (int j=i+2;j<=s.length();j=j+2){
                if (isValid(new Stack<Character>(),s.substring(i,j))){
                    maxLength=Math.max(maxLength,j-i);
                }
            }
        }
        return maxLength;
    }

    public static boolean isValid(Stack<Character> stack,String s){
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c == '('){
                stack.push(c);
            }else if (!stack.empty() && stack.peek()=='('){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();
    }

    /**
     * 动态规划解法
     * @param s
     * @return
     */
    public int longestValidParenthesess(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                //右括号前边是左括号
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                    //右括号前边是右括号，并且除去前边的合法序列的前边是左括号
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

}
