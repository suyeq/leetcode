package leetcode;

/**
 * @author: 苍术
 * @date: 2019-07-19
 * @time: 11:02
 */
public class Q76 {

    /**
     * 示例：
     *
     * 输入: S = "ADOBECODEBANC", T = "ABC"
     * 输出: "BANC"
     * 说明：
     *
     * "cabwefgewcwaefgcf"
     * "cae"
     * 如果 S 中不存这样的子串，则返回空字符串 ""。
     * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
     *
     * "aaaaaaaaaaaabbbbbcdd"
     * "abcdd"
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/minimum-window-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        String a="a";
        String b="a";
        System.out.println(minWindow(a,b));
    }

    public static String minWindow(String s, String t) {
        int start=0;
        int end=-1;
        int []window=new int[256];
        int []need=new int[256];
        int count=0;
        String minString=s.concat("1");
        for (int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }
        while (start < s.length()){
            if (end+1<s.length() && !valid(window,need)){
                if (need[s.charAt(++end)]>0){
                    window[s.charAt(end)]++;
                    //count++;
                }
            }else {
                if (need[s.charAt(start)] > 0){
                    window[s.charAt(start)]--;
                }
                start++;
//                if (need[s.charAt(start)] != 0){
//                    count--;
//                    window[s.charAt(start++)]--;
//                }
//                while (start <s.length() && need[s.charAt(start)] == 0){
//                    start++;
//                }
            }
            if (valid(window,need)){
                minString=minString.length()>(end-start+1)?s.substring(start,end+1):minString;
            }
        }
        if (minString.equals(s.concat("1")) ){
            return "";
        }
        return minString;
    }

//    public static String minWindow(String s, String t) {
//        int start=0;
//        int end=-1;
//        int []window=new int[256];
//        int []need=new int[256];
//        int count=0;
//        String minString=s.concat("1");
//        for (int i=0;i<t.length();i++){
//            need[t.charAt(i)]++;
//        }
//        while (start < s.length()){
//            if (end+1<s.length() && count < t.length()){
//                if (need[s.charAt(++end)]>0){
//                    window[s.charAt(end)]++;
//                    count++;
//                }
//            }else {
//                if (need[s.charAt(start)] != 0){
//                    count--;
//                    window[s.charAt(start++)]--;
//                }
//                while (start <s.length() && need[s.charAt(start)] == 0){
//                    start++;
//                }
//            }
//            if (count == t.length() && valid(window,need)){
//                minString=minString.length()>(end-start+1)?s.substring(start,end+1):minString;
//            }
//        }
//        if (minString.equals(s.concat("1")) ){
//            return "";
//        }
//        return minString;
//    }

    private static boolean valid(int[] window, int[] need) {
        for (int i=0;i<window.length;i++){
            if (window[i] < need[i]){
                return false;
            }
        }
        return true;
    }

}
