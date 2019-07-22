package leetcode;

import java.util.Arrays;

public class Q27 {

	/**
	 *  [0,1,2,2,3,0,4,2], val = 2
	 * @param args
	 */
	public static void main(String[] args) {
		int []a= {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(a,2));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			
		}
	}
	
	public static int removeElement(int[] nums, int val) {
	    int i=0;
	    int size=0;
	    for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				if (i != j) {
					swap(nums,i++,j);
				}else {
					i++;
				}
			}
			if (j == nums.length-1) {
				size=nums.length-(j-i+1);
			}
		}
		return size;
	}
	
	public static void swap(int []nums,int i,int j) {
		nums[i]=nums[i]^nums[j];
		nums[j]=nums[i]^nums[j];
		nums[i]=nums[i]^nums[j];
	}

}
