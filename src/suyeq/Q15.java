package suyeq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-23
 * @time: 16:58
 */
public class Q15 {
    /**
     * nums = [-1, 0, 1, 2, -1, -4]
     * nums = [-4,-1, -1, 0, 1, 2]
     * @param args
     */
    public static void main(String[] args){
        int []s={-2,0,1,1,2};
        List<List<Integer>> lists=threeSum(s);
        System.out.println(lists.size());
        for (int i=0;i<lists.size();i++){
           for (int j=0;j<lists.get(i).size();j++){
               System.out.print(lists.get(i).get(j)+" ");
           }
           System.out.println(" ");
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        int length=nums.length;
        for(int i=0;i<length-2;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int a=nums[i];
            int j=i+1;
            int k=length-1;
            while(j<k){
                int b=nums[j];
                int c=nums[k];
                if(a+b+c>0){
                    k--;
                }else if(a+b+c<0){
                    j++;
                }else {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }

}
