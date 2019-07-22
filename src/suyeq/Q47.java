package suyeq;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static suyeq.Q46.permute;

/**
 * @author: 苍术
 * @date: 2019-07-12
 * @time: 10:47
 */
public class Q47 {

    public static void main(String []args){
        int []a={1,1,2};
        List<List<Integer>> lists=permuteUnique(a);
        System.out.println(lists);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
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
            for (int i=0;i<lists.size();i++){
                if (lists.get(i).equals(new LinkedList<>(list))){
                    return;
                }
            }
            lists.add(new LinkedList<>(list));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (flag[i] == true){
                continue;
            }
            /**
             * 剪枝，去除重复的
             */
            if (i-1 >=0 && flag[i-1] ==true && nums[i]==nums[i-1]){
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
