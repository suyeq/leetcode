package suyeq;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-01
 * @time: 18:49
 */
public class Q16 {
    /**
     * -1，2，1，-4
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length<3){
            return 0;
        }
        int indexStart;
        int indexEnd;
        int most=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            indexStart=i+1;
            indexEnd=indexStart+1;
            while (indexStart!=nums.length-1){
                int temp=nums[i]+nums[indexStart]+nums[indexEnd];
                if (Math.abs(temp-target)<Math.abs(most-target)){
                    most=temp;
                }
                indexEnd++;
                if (indexEnd==nums.length){
                    indexStart++;
                    indexEnd=indexStart+1;
                }
            }
        }
        return most;
    }

    public static void main(String []args){
        int []arrays={-1,2,1,-4};
        System.out.println(threeSumClosest(arrays,1));
    }
}
