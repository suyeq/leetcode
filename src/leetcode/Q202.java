package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 10:06
 */
public class Q202 {

    /**
     * 示例: 
     *
     * 输入: 19
     * 输出: true
     * 解释:
     * 12 + 92 = 82
     * 82 + 22 = 68
     * 62 + 82 = 100
     * 12 + 02 + 02 = 1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/happy-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args){
        System.out.println(isHappy(1));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int iter=n;
        while (set.add(iter)){
            if (iter == 1){
                return true;
            }
            iter=converseInterger(iter);
        }
        return false;
    }

    public static int converseInterger(int num){
        int result=0;
        while (num > 0){
            result+=Math.pow(num%10,2);
            num/=10;
        }
        return result;
    }
}
