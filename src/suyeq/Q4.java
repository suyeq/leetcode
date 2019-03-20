package suyeq;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-09
 * @time: 15:40
 */
public class Q4 {

    public static void main(String [] args){
        int[] nums1 = {-1, 2};
        int[] nums2 = {3,4,6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        double[] f=new double[len1+len2];
        for (int i=0;i<len1;i++){
            f[i]=nums1[i];
        }

        for (int i=len1;i<len2+len1;i++){
            f[i]=nums2[i-len1];
        }
        Arrays.sort(f);
        if (f.length% 2==0){
            return (f[f.length/2-1]+f[f.length/2])/2;
        }else {
            return f[f.length/2];
        }

    }
}
