package suyeq;

import java.util.stream.StreamSupport;

/**
 * Created with IntelliJ IDEA.
 *t 贪心思想解决
 * @author: Suyeq
 * @date: 2019-03-21
 * @time: 19:49
 */
public class Q11 {
    public static void main(String[] args){
        int []test={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(test));
    }

    public static int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area=0;
        while (start<end){
            area=Math.max(area,(end-start)*Math.min(height[start],height[end]));
            if (height[start]>height[end]){
                end--;
            }else {
                start++;
            }
        }
        return area;
    }

}
