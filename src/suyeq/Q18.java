package suyeq;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-02
 * @time: 14:41
 */
public class Q18 {
    public static void main(String[] args){
        int []array={1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(array,0).toString());
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        int indexStart=0;
        int indexEnd=0;
        int sum;
        for (int i=0;i<nums.length-2;i++){
           for (int j=i+1;j<nums.length-1;j++){
               indexStart=j+1;
               indexEnd=nums.length-1;
               while (indexStart<indexEnd){
                   sum=nums[i]+nums[j]+nums[indexStart]+nums[indexEnd];
                   if (sum>target){
                       indexEnd--;
                   }else if (sum<target){
                       indexStart++;
                   }else {
                       List<Integer> list=new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[indexStart]);
                       list.add(nums[indexEnd]);
                       set.add(list);
                       indexStart++;
                   }
               }
           }
        }
        return new ArrayList<>(set);
    }
}
