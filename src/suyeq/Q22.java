package suyeq;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: 苍术
 * @date: 2019-07-08
 * @time: 18:20
 */
public class Q22 {

    public static void main(String []args){
        List<String> list=new LinkedList<>();
        generateAll(new char[6],0,list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    public static void generateAll(char[] current, int pos, List<String> result) {
        if (pos == current.length) {
            //if (valid(current)) {
                result.add(new String(current));
            //}
        } else {
            current[pos] = '(';
            generateAll(current, pos+1, result);
            current[pos] = ')';
            generateAll(current, pos+1, result);
        }
    }

    public static  boolean valid(char[] current) {
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }



}
