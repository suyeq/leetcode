package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 21:06
 */
public class Q1 {

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        int []a={2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(a,9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int result=target-nums[i];
            if (map.get(result) != null){
                int []res=new int[2];
                res[0]=i;
                res[1]=map.get(result);
                return res;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
