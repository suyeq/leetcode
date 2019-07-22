package leetcode;

import java.util.Arrays;

/**
 * @author: 苍术
 * @date: 2019-07-18
 * @time: 14:58
 */
public class Q209 {

    /**
     * 输入: s = 7, nums = [2,3,1,2,4,3]
     * 输出: 2
     * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
     * @param args
     */
    public static void  main(String []args){
        int []a={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,a));
    }



    /**
     * 滑动窗口法,n的解法
     * start与end指针都遍历了一遍数组
     * @param s
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int start=0;
        int end=-1;
        int minLength=nums.length+1;
        int sum=0;
        while (start < nums.length){
            if (end+1<nums.length && sum < s){
                sum+=nums[++end];
            }else {
                sum-=nums[start++];
            }
            if (sum >= s){
                minLength=Math.min(minLength,end-start+1);
            }
        }
        if (minLength == nums.length+1){
            return 0;
        }
        return minLength;
    }
}
