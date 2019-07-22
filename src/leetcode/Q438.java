package leetcode;

import java.util.*;

/**
 * @author: 苍术
 * @date: 2019-07-18
 * @time: 17:19
 */
public class Q438 {

    /**
     * 输入:
     * s: "cbaebabacd" p: "abc"
     *
     * 输出:
     * [0, 6]
     * @param args
     *
     * "ababababab"
     * "aab"
     */
    public static void main(String []args){
        String a="abb";
        String b="bb";
//        Map<Character,Integer> map=new HashMap<>(3);
//        Map<Character,Integer> map1=new HashMap<>(3);
        //System.out.println(map.size()+" "+map1.size());
        System.out.println(findAnagrams(a,b).toString());
    }


    public static List<Integer> findAnagrams(String s, String p) {
        int[] need=new int[256];
        int[] window=new int[256];
        int start=0;
        int end=-1;
        int count=0;
        List<Integer> list=new LinkedList<>();
        for (int i=0;i<p.length();i++){
            need[p.charAt(i)]++;
        }
        while (start < s.length()){
            if (end+1 < s.length() && count<p.length()){
                window[s.charAt(++end)]++;
                count++;
            }else {
                window[s.charAt(start++)]--;
                count--;
            }
            if (count == p.length() && valied(window,need)){
                list.add(start);
            }
        }
        return list;
    }

    private static boolean valied(int[] window, int[] need) {
        for (int i=0;i<window.length;i++){
            if (window[i] != need[i]){
                return false;
            }
        }
        return true;
    }

//    public static List<Integer> findAnagrams(String s, String p) {
//        int end=-1;
//        int start=0;
//        Map<Character,Integer> mapNeed=new HashMap<>(256);
//        for (int i=0;i<p.length();i++){
//            Integer value=mapNeed.get(p.charAt(i));
//            if (value == null){
//                mapNeed.put(p.charAt(i),1);
//            }else {
//                mapNeed.put(p.charAt(i),++value);
//            }
//        }
//        System.out.println(mapNeed.toString());
//        List<Integer> list=new LinkedList<>();
//        Map<Character,Integer> map=new HashMap<>(p.length());
//        while (start < s.length()){
//            if (end+1<s.length() && map.size()<p.length()){
//                Integer value=map.get(s.charAt(++end));
//                if (value == null){
//                    map.put(s.charAt(end),1);
//                }else {
//                    map.put(s.charAt(end),++value);
//                }
//            }else {
//                Integer value=map.get(s.charAt(start));
//                if (value == 1){
//                    map.remove(s.charAt(start++));
//                }else {
//                    Integer value1=map.get(s.charAt(start));
//                    map.put(s.charAt(start++),--value);
//                }
//            }
//            //System.out.println(map.keySet().toString());
//            if (map.size() == mapNeed.size() && valid(map,mapNeed)){
//                list.add(start);
//            }
//        }
//        return list;
//    }

//    public static List<Integer> findAnagrams(String s, String p) {
//        int end=-1;
//        int start=0;
//        List<Integer> list=new LinkedList<>();
//        Map<Character,Integer> map=new HashMap<>(p.length());
//        while (start < s.length()){
//            if (end+1<s.length() && keyList.size()<p.length()){
//                keyList.add(s.charAt(++end));
//            }else {
//                keyList.remove(0);
//                start++;
//            }
//            //System.out.println(map.keySet().toString());
//            if (keyList.size() == p.length() && valid(keyList,p)){
//                list.add(start);
//            }
//        }
//        return list;
//    }
//
//    public static boolean valid(List list,String p){
//        for (int i=0;i<p.length();i++){
//            if (!list.contains(p.charAt(i))){
//                return false;
//            }
//        }
//        for (int i=0;i<list.size();i++){
//            if (p.indexOf((Character)list.get(0))<0){
//                return false;
//            }
//        }
//        return true;
////    }

//    public static boolean valid(Map map,Map mapNeed){
//        System.out.println("--------------");
//        System.out.println(map.toString());
//        System.out.println(mapNeed.toString());
//        System.out.println("--------------");
//        Set<Character> key=map.keySet();
//        Iterator iterator=key.iterator();
//        while (iterator.hasNext()){
//            Character c=(Character) iterator.next();
//            if (map.get(c) == null || map.get(c)!=mapNeed.get(c)){
//                return false;
//            }
//        }
//        return true;
//    }
}
