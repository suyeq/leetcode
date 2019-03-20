package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-20
 * @time: 15:52
 */
public class Q7 {
    public static void main(String [] args){
        System.out.println(reverse(Integer.MIN_VALUE));
    }

    public static int reverse(int x) {
        if (x <= Integer.MIN_VALUE || x > Integer.MAX_VALUE){
            return 0;
        }
        String needReverseNumber=x+"";
        StringBuilder stringBuilder=new StringBuilder();
        long result=0;
        if (x >= 0){
            for (int i=needReverseNumber.length()-1; i>=0; i--){
                stringBuilder.append(needReverseNumber.charAt(i));
            }
            result=Long.parseLong(stringBuilder.toString());
            if (result > Integer.MAX_VALUE){
                return 0;
            }
        }else {
            for (int i=needReverseNumber.length()-1; i>0; i--){
                stringBuilder.append(needReverseNumber.charAt(i));
            }
            result=-Long.parseLong(stringBuilder.toString());
            if (result < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)result;
    }
}
