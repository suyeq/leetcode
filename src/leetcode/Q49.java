package leetcode;

import java.util.*;

/**
 * @author: 苍术
 * @date: 2019-07-22
 * @time: 11:39
 */
public class Q49 {

    /**
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/group-anagrams
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        String[] strings={"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String str:strs){
            char []string=str.toCharArray();
            Arrays.sort(string);
            String newString=String.valueOf(string);
            if (!map.containsKey(newString)){
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(newString,list);
            }else {
                List<String> list=map.get(newString);
                list.add(str);
                map.put(newString,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
