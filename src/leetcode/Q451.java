package leetcode;

import java.util.*;

/**
 * @author: 苍术
 * @date: 2019-07-20
 * @time: 16:04
 */
public class Q451 {

    static class Node implements Comparable<Node>{
        int times;
        char ch;

        public Node(int times,char ch){
            this.times=times;
            this.ch=ch;
        }

        @Override
        public int compareTo(Node node) {
            if (this.times>node.times){
                return 1;
            }else if (this.times<node.times){
                return -1;
            }
            return 0;
        }

        @Override
        public String toString(){
            return "[times="+times+",ch="+ch+"]";
        }
    }

    public static void main(String [] args){
        String s="Aabb";
        System.out.println(frequencySort(s));
        //System.out.println('A'-'0');
    }



    public static String frequencySort(String s) {
        Objects.requireNonNull(s);
        int []free=new int[256];
        List<Node> list=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            free[s.charAt(i)]++;
        }
        for (int i=0;i<free.length;i++){
            if (free[i]!=0){
                Node node=new Node(free[i],(char)i);
                list.add(node);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        StringBuilder newString=new StringBuilder("");
        for (int i=0;i<list.size();i++){
            Node node=list.get(i);
            int j=node.times;
            while (j-->0){
                newString.append(node.ch);
            }
        }
        return new String(newString);
    }
}
