package suyeq;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 苍术
 * @date: 2019-07-12
 * @time: 9:50
 */
public class Q46 {

    /**
     * [1,2,3]
     * @param args
     */
    public static void main(String[] args){
        int []a={1,2,3};
        List<List<Integer>> lists=permute(a);
        System.out.println(lists);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists=new LinkedList<>();
        boolean []flag=new boolean[nums.length];
        for (int i=0;i<flag.length;i++){
            flag[i]=false;
        }
        Arrays.sort(nums);
        backTrack(nums,lists,new LinkedList<>(),flag);
        return lists;
    }

    public static void backTrack(int []nums,List<List<Integer>> lists,List<Integer> list,boolean []flag){
        if (list.size() == nums.length){
            lists.add(new LinkedList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (flag[i] == true){
                continue;
            }
            list.add(nums[i]);
            flag[i]=true;
            backTrack(nums,lists,list,flag);
            list.remove(list.size()-1);
            flag[i]=false;
        }

    }
}
