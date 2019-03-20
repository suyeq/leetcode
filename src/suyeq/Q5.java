package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-09
 * @time: 16:29
 */
public class Q5 {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        String s="zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        System.out.println(longestPalindrome(s));
        long end=System.currentTimeMillis();
        System.out.println((end-start));
    }

    /**
     * s(i,j)=true
     * s[i]==s[j]&&s[i+1]==s[j-1].......
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int start=0;
        int end=0;
        if (s.length() == 0){
            return "";
        }
        char t=s.charAt(0);
        int flag=0;
        for (int i=0;i<s.length();i++){
            if (t != s.charAt(i)){
                flag=1;
            }
        }
        if (flag==0){
            return s;
        }
        int longStringLength=0;
        int length=s.length();
        for (int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if (isNeed(s,i,j)){
                    if (j-i >= longStringLength){
                        longStringLength=j-i+1;
                        start=i;
                        end=j+1;
                    }
                }
            }
        }
        return s.substring(start,end);
    }

    public static boolean isNeed(String s,int i,int j){
        if (i == j || (i-1)==j){
            return true;
        }
        if (s.charAt(i) == s.charAt(j)){
            return isNeed(s,i+1,j-1);
        }
        return false;
    }
}
