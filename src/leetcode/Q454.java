package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 苍术
 * @date: 2019-07-22
 * @time: 10:16
 */
public class Q454 {

    /**
     * 输入:
     * A = [ 1, 2]
     * B = [-2,-1]
     * C = [-1, 2]
     * D = [ 0, 2]
     *
     * 输出:
     * 2
     *
     * 解释:
     * 两个元组如下:
     * 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
     * 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/4sum-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        int []A={1,2};
        int []B={-2,-1};
        int []C={-1,2};
        int []D={0,2};
        System.out.println(fourSumCount(A,B,C,D));
    }

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result=0;
        Map<Integer,Integer> recordMap=new HashMap<>();
        for (int i=0;i<C.length;i++){
            for (int j=0;j<D.length;j++){
                Integer value=recordMap.get(C[i]+D[j]);
                if (value == null){
                    value=0;
                }
                recordMap.put(C[i]+D[j],++value);
            }
        }
        for (int i=0;i<A.length;i++){
            for (int j=0;j<B.length;j++){
                if (recordMap.get(0-A[i]-B[j]) != null){
                    result+=recordMap.get(0-A[i]-B[j]);
                }
            }
        }
        return result;
    }
}
