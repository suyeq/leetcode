package suyeq;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: 苍术
 * @date: 2019-07-11
 * @time: 19:43
 */
public class Q40 {

    /**
     * [10,1,2,7,6,1,5], target = 8
     * @param args
     */

    public static void main(String []args){
        int []a={4,4,2,1,4,2,2,1,3};
        List<List<Integer>> lists=combinationSum2(a,6);
        System.out.println(lists);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        int length=candidates.length;
//        boolean[] flag=new boolean[length];
//        for (int i=0;i<flag.length;i++){
//            flag[i]=false;
//        }
        Arrays.sort(candidates);
        List<List<Integer>> lists=new LinkedList<>();
       // backTrack(candidates,target,0,flag,new LinkedList<>(),lists);
        backTrack(candidates,target,0,new LinkedList<>(),lists);
        return lists;
    }

    public static void backTrack(int []candidates,int target,int start,List<Integer> list,List<List<Integer>> lists){
        if (target<0){
            return;
        }
        if (target == 0){
           for (int j=0;j<lists.size();j++){
               if (lists.get(j).equals(new LinkedList<>(list))){
                   return;
               }
           }
            lists.add(new LinkedList<>(list));
            return;
        }
        for (int i=start;i<candidates.length;i++){
//            if (flag[i] ==true){
//                continue;
//            }
            list.add(candidates[i]);
//            flag[i]=true;
            backTrack(candidates,target-candidates[i],i+1,list,lists);
            list.remove(list.size()-1);
//            flag[i]=false;
        }
    }

//    public boolean isContain(List<List<Integer>> lists,List<Integer> newList){
//        for (int i=0;i<lists.size();i++){
//            boolean isContains=false;
//            List<Integer> list=lists.get(i);
//            if (list.size() != newList.size()){
//                continue;
//            }
//            for (int j=0;j<list.size();j++){
//                if (list.get(i) .equals() newList.get(i)){
//
//                }
//            }
//        }
//
//        return false;
//    }

}
