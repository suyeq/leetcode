package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-21
 * @time: 10:34
 */
public class Q8 {

    public static void main(String[] args){
        System.out.println(myAtoi("010"));
       // System.out.println(myAtoi("  00012345678"));
    }

    public static int myAtoi(String str) {
        long temp;
        char firstChar='s';
        int indexStart=0;
        int indexEnd=0;
        for (int i=0;i<str.length();i++){
            char index=str.charAt(i);
            if (index != ' '){
                firstChar=index;
                indexStart=i;
                break;
            }
        }
        boolean is=(firstChar >= '0' && firstChar <= '9') || firstChar=='+' ||firstChar=='-';
        if (!is){
            return 0;
        }
        boolean isend=false;
        for (int i=indexStart+1;i<str.length();i++){
            char index=str.charAt(i);
             is=(index >= '0' && index <= '9');
             if (!is){
                 isend=true;
                 indexEnd=i-1;
                 break;
             }
             if (!isend){
                 indexEnd=i;
             }
        }
        int point=0;
        if ((firstChar >= '0' && firstChar <= '9')){
            for (int i=indexStart;i<=indexEnd;i++){
                if (str.charAt(i) == '0'){
                    point++;
                }
                if (str.charAt(i) !='0'){
                    break;
                }
            }
        }else if (firstChar == '+' || firstChar == '-'){
            for (int i=indexStart+1;i<=indexEnd;i++){
                if (str.charAt(i) == '0'){
                    point++;
                }
                if (str.charAt(i) !='0'){
                    break;
                }
            }
        }
        indexStart=indexStart+point;
        if (indexEnd-indexStart < 1 && (firstChar=='+' || firstChar=='-') ){
            return 0;
        }
        if (indexEnd -indexStart >=18){
            if ((firstChar >= '0' && firstChar <= '9')){
                return Integer.MAX_VALUE;
            }else if (firstChar == '+'){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }
        if ((firstChar >= '0' && firstChar <= '9')){

            if (str.substring(indexStart,indexEnd+1).equals("") ){
                return 0;
            }
            temp=Long.parseLong(str.substring(indexStart,indexEnd+1));
        }else if (firstChar == '+'){
            temp=Long.parseLong(str.substring(indexStart+1,indexEnd+1));
        }else {
            temp=-Long.parseLong(str.substring(indexStart+1,indexEnd+1));
        }
        if (temp > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if (temp < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)temp;
    }
}
