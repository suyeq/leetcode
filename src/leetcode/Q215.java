package leetcode;

import java.util.Arrays;

public class Q215 {

	public static void main(String[] args) {
		int []a= {3,2,3,1,2,4,5,5,6};
		System.out.println(findKthLargest(a, 4));

	}
	
	/**
	 * 先排序再求值，时间复杂度为nlgn，可以使用空间换时间
	 * 利用堆来实现n级别的算法
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int findKthLargest(int[] nums, int k) {
	   Arrays.sort(nums);
	   return nums[nums.length-k];
	}

}
