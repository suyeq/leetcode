package leetcode;

public class Q88 {

	/**
	 * nums1 = [1,2,3,0,0,0], m = 3
	 *	nums2 = [2,5,6],       n = 3
	 * @param args
	 */
	public static void main(String[] args) {
		
		int []nums1 = {0};
		int []nums2 = {5};
		merge(nums1, 0, nums2, 1);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]);
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       int index1=m-1;
	       int index2=n-1;
	       while(index1 >=0 && index2 >= 0) {
	    	   if (nums1[index1] >= nums2[index2]) {
	    		   nums1[index1+index2+1]=nums1[index1];
	    		   index1--;
	    	   }else if(nums1[index1] < nums2[index2]) {
	    		   nums1[index1+index2+1]=nums2[index2];
	    		   index2--;
	    	   }
	       }
	       for(int i=index2 ;i>=0;i--) {
	    	   nums1[i]=nums2[index2--];
	       }
	}

}
