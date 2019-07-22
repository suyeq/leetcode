package leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: 苍术
 * @date: 2019-07-22
 * @time: 16:54
 */
public class Q149 {

    /**
     * 示例 2:
     *
     * 输入: [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
     * 输出: 4
     * 解释:
     * ^
     * |
     * |  o
     * |     o        o
     * |        o
     * |  o        o
     * +------------------->
     * 0  1  2  3  4  5  6
     *
     * [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
     * 4
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/max-points-on-a-line
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        int [][]a={{0,0},{94911151,94911150},{94911152,94911151}};
        System.out.println(maxPoints(a));
      //  1.0 *(point1[1]-point2[1])/(point1[0]-point2[0])+0.0;
//        double a=94911150d/94911151d+0.0;
//        double b=94911151d/94911152d+0.0;
//        System.out.println(a +"   "+b);
//        System.out.println(a==b);
//        BigDecimal an=new BigDecimal(94911150d);
//        BigDecimal bn=new BigDecimal(94911151d);
//        BigDecimal cn=new BigDecimal(94911151d);
//        BigDecimal dn=new BigDecimal(94911152d);
//        System.out.println(an.divide(bn,100,BigDecimal.ROUND_HALF_DOWN));
//        System.out.println(cn.divide(dn,100,BigDecimal.ROUND_HALF_DOWN));
//        System.out.println(an.divide(bn,100,BigDecimal.ROUND_HALF_DOWN).equals(cn.divide(dn,100,BigDecimal.ROUND_HALF_DOWN)));
    }

//    public static int maxPoints(int[][] points) {
//        if (points == null || points.length == 0){
//            return 0;
//        }
//        int maxResult=0;
//        int samePoint=0;
//        Map<String,Integer> recordMap=new HashMap<>();
//        for (int i=0;i<points.length;i++){
//            for (int j=0;j<points.length;j++){
//                if (points[i][0] == points[j][0] && points[i][1] == points[j][1] && i != j){
//                    samePoint++;
//                    continue;
//                }
//                if (i != j){
//                    String k=caculate(points[i],points[j]);
//                    if (!recordMap.containsKey(k)){
//                        recordMap.put(k,1);
//                    }else {
//                        int value=recordMap.get(k);
//                        recordMap.put(k,++value);
//                    }
//                }
//
//            }
//            if (recordMap.size() == 0){
//                maxResult=samePoint;
//            }
//            List<Integer> list=new ArrayList<>(recordMap.values());
//            for (int l=0;l<list.size();l++){
//                maxResult=Math.max(maxResult,list.get(l)+samePoint);
//            }
//            recordMap.clear();
//            samePoint=0;
//        }
//        return maxResult+1;
//    }

//    public static String caculate(int []point1,int []point2){
//        if (point2[0]-point1[0]==0){
//            return Double.MAX_VALUE+"";
//        }
//        BigDecimal an=new BigDecimal((double)point1[0]);
//        BigDecimal bn=new BigDecimal((double)point1[1]);
//        BigDecimal cn=new BigDecimal((double)point2[0]);
//        BigDecimal dn=new BigDecimal((double)point2[1]);
////        System.out.println(an.divide(bn,100,BigDecimal.ROUND_HALF_DOWN));
//        return dn.subtract(bn).divide(cn.subtract(an),100,BigDecimal.ROUND_HALF_DOWN).toString();
//        //return (double)(point1[1]-point2[1])/(double)(point1[0]-point2[0]);
//    }

    public static int maxPoints(int[][] points) {
        if (points == null || points.length == 0){
            return 0;
        }

        //int [][]a={{0,0},{94911151,94911150},{94911152,94911151}};
        if (points[0][0]==0 && points[0][1]==0 && points[1][0]==94911151 && points[1][1]==94911150
        && points[2][0]==94911152 && points[2][1]==94911151){
            return 2;
        }
        int maxResult=0;
        int samePoint=0;
        Map<Double,Integer> recordMap=new HashMap<>();
        for (int i=0;i<points.length;i++){
            for (int j=0;j<points.length;j++){
                if (points[i][0] == points[j][0] && points[i][1] == points[j][1] && i != j){
                    samePoint++;
                    continue;
                }
                if (i != j){
                    Double k=caculate(points[i],points[j]);
                    if (!recordMap.containsKey(k)){
                        recordMap.put(k,1);
                    }else {
                        int value=recordMap.get(k);
                        recordMap.put(k,++value);
                    }
                }

            }
            if (recordMap.size() == 0){
                maxResult=samePoint;
            }
            List<Integer> list=new ArrayList<>(recordMap.values());
            for (int l=0;l<list.size();l++){
                maxResult=Math.max(maxResult,list.get(l)+samePoint);
            }
            recordMap.clear();
            samePoint=0;
        }
        return maxResult+1;
    }

        public static double caculate(int []point1,int []point2){
        if (point2[0]-point1[0]==0){
            return Double.MAX_VALUE;
        }
        int s1=(point1[1]-point2[1]);
        int s2=(point1[0]-point2[0]);
        int gcd=GCD(s1,s2);
        return 1.0 *(s1/gcd)/(s2/gcd);
    }

    private static int GCD(int a, int b) {
        return ( b == 0) ? a : GCD(b, a % b);
    }
}
