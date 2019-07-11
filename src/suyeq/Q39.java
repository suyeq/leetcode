package suyeq;

import java.util.*;

/**
 * @author: 苍术
 * @date: 2019-07-10
 * @time: 15:05
 */
public class Q39 {

    public static void main(String[] args){
        int []a={10,1,2,7,6,1,5};
        System.out.println(combinationSum(a,8));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists=new LinkedList<>();
        List<Integer> list=new LinkedList<>();
        backStep(candidates,target,0,list,lists);
        return lists;
    }

    public static void backStep(int []candidates,int target,int start,List<Integer> list,List<List<Integer>> lists){
        if (target == 0){
            lists.add(new LinkedList<>(list));
        }else if (target < 0){
            return;
        }else {
            for (int i=start;i<candidates.length;i++){
                list.add(candidates[i]);
                backStep(candidates,target-candidates[i],i,list,lists);
                list.remove(list.size()-1);
            }
        }
    }


}
