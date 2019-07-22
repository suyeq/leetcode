package leetcode;

import java.util.Arrays;

public class Q344 {
	
	public static void main(String []args) {
		char []a= {'h'};
		reverseString(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<=end) {
        	swap(s, start++, end--);
        }
    }
	
	public static void swap(char[] s,int i,int j) {
		char temp=s[i];
		s[i]=s[j];
		s[j]=temp;
	}

}
