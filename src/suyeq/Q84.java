package suyeq;

import java.util.Arrays;

/**
 * @author: 苍术
 * @date: 2019-07-15
 * @time: 11:15
 */
public class Q84 {

    public static void main(String []args){
        int []a={5,5,1,7,1,1,5,2,7,6};
        System.out.println(largestRectangleArea(a));
    }

    /**
     * 分治策略
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        return caculateArea(heights,0,heights.length-1);
    }

    public static int caculateArea(int []height,int start,int end){
        if (start>end){
            return 0;
        }
        int minLength=height[start];
        int midCursor=start;
        for (int i=start;i<=end;i++){
            if (minLength>height[i]){
                minLength=height[i];
                midCursor=i;
            }
        }
        int area=area(start,end,minLength);
        return Math.max(area,Math.max(caculateArea(height,start,midCursor-1),caculateArea(height,midCursor+1,end)));
    }

    public static int area(int start,int end,int height){
        return (end-start+1)*height;
    }


    public static int minArray(int[] nums,int start,int end){
        int min=nums[start];
        for (int i=start;i<=end;i++){
            if (min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }

    public static int maxArray(int[] nums,int start,int end){
        int max=nums[start];
        for (int i=start;i<=end;i++){
            if (max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
}
