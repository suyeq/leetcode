package suyeq;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-04-01
 * @time: 19:31
 */
public class Q17 {
    public static void main(String []args){
        System.out.println(letterCombinations("234"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        String []s=new String[digits.length()];
        if(s.length==0){
            return list;
        }
        int length=digits.length();
        for(int i=0;i<digits.length();i++){
            switch (digits.charAt(i)){
                case '2':s[i]="abc";break;
                case '3':s[i]="def";break;
                case '4':s[i]="ghi";break;
                case '5':s[i]="jkl";break;
                case '6':s[i]="mno";break;
                case '7':s[i]="pqrs";break;
                case '8':s[i]="tuv";break;
                case '9':s[i]="wxyz";break;
                default:break;
            }
        }
        return dfsFind(s,0,list,"");
    }

    static List<String>  dfsFind(String[] s,int level,List<String> list,String temp){
        if (level<s.length-1){
            for (int i=0;i<s[level].length();i++){
                 dfsFind(s,level+1,list,temp+s[level].charAt(i));
            }
        }else {
            for (int i=0;i<s[level].length();i++){
                list.add(temp+s[level].charAt(i));
            }
        }
        return list;
    }


}
