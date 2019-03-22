package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-22
 * @time: 21:44
 */
public class Q14 {
    public static void main(String[] args){
        String []strings={};
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        int maxStringLength=0;
        String maxString=null;
        int []maxMatchLength=new int[strs.length];
        for (int i=0;i<strs.length;i++){
            if (strs[i].length()>maxStringLength){
                maxStringLength=strs[i].length();
                maxString=strs[i];
            }
        }
        for (int i=0;i<strs.length;i++){
            int index=0;
            for (int j=0;j<strs[i].length();j++){
                if (strs[i].charAt(j) == maxString.charAt(j)){
                    index++;
                }
                if (strs[i].charAt(j) != maxString.charAt(j)){
                    break;
                }
            }
            maxMatchLength[i]=index;
        }
        maxStringLength=maxMatchLength[0];
        for (int i=0;i<strs.length;i++){
            if (maxMatchLength[i]<maxStringLength){
                maxStringLength=maxMatchLength[i];
            }
        }
        if (maxStringLength==0){
            return "";
        }
        return maxString.substring(0,maxStringLength);
    }
}
