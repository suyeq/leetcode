package leetcode;

import java.util.Arrays;

public class Q167 {

	/**
	 *  输入: numbers = [2, 7, 11, 15], target = 9
	 *	输出: [1,2]
	 *	解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
	 *  @param args
	 */
	public static void main(String[] args) {
		int [] number= {5,25,75};
		int []result=twoSum(number, 100);
		System.out.println(Arrays.toString(result));
	}
	
	/**
	 * 指针碰撞  
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] numbers, int target) {
	        int []index=new int[2];
	        index[0]=1;
	        index[1]=numbers.length;
	        while(true) {
	        	int result=numbers[index[0]-1]+numbers[index[1]-1];
	        	if (result>target) {
					index[1]--;
				}else if(result<target) {
					index[0]++;
				}else {
					return index;
				}
	        }
	}

}
