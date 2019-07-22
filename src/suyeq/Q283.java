package suyeq;

/**
 * @author: 苍术
 * @date: 2019-07-16
 * @time: 10:26
 */
public class Q283 {

    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * @param args
     */
    public static void main(String[] args){
        int []num={1,4,6,1};
        moveZeroes(num);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j] != 0){
                if (i != j){
                    swap(nums,i++,j);
                }else {
                    i++;
                }
            }
        }
    }

    public static void swap(int []nums,int i, int j ){
        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];
    }
}
