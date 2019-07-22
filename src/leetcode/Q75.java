package leetcode;

import com.sun.org.apache.regexp.internal.recompile;

public class Q75 {

	/**
	 * [2,0,2,1,1,0]
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,0};
		sortColors(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	
	}
	
	public static void sortColors(int[] nums) {
		int start=-1;
		int end=nums.length;
		for (int i = 0; i < end;) {
			if (nums[i] == 0) {
				swap(nums, ++start, i++);
			}else if (nums[i] == 2) {
				swap(nums, i, --end);
			}else {
				i++;
			}
		}
	}
	
	public static void swap(int[]nums,int i,int j) {
		if (i == j) {
			return;
		}
		nums[i]=nums[i]^nums[j];
		nums[j]=nums[i]^nums[j];
		nums[i]=nums[i]^nums[j];
	}
	
	

}
