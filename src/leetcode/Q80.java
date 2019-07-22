package leetcode;

import java.util.Arrays;
import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Q80 {

	public static void main(String[] args) {
		int []a= {-1,0,0,0,0,3,3};
		System.out.println(removeDuplicates(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		int i = 0;
        for (int n : nums){
            if (i < 2 || n != nums[i-2]){
                nums[i] = n;
                i++;
            }
        }
        return i;
	}
	
	public static void swap(int []nums,int i,int j) {
		nums[i]=nums[i]^nums[j];
		nums[j]=nums[i]^nums[j];
		nums[i]=nums[i]^nums[j];
	}

}
