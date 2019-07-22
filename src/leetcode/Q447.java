package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: 苍术
 * @date: 2019-07-22
 * @time: 15:10
 */
public class Q447 {

    /**
     * 输入:
     * [[0,0],[1,0],[2,0]]
     *
     * 输出:
     * 2
     *
     * 解释:
     * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/number-of-boomerangs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String []args){
        int [][]a={{1,1},{2,2},{3,3}};
        System.out.println(numberOfBoomerangs(a));
    }

    public static int numberOfBoomerangs(int[][] points) {
        int result=0;
        Map<Integer,Integer> recordMap=new HashMap<>();
        for (int i=0;i<points.length;i++){
            for (int j=0;j<points.length;j++){
                if (i != j){
                    int key=cucalate(points[i],points[j]);
                    if (!recordMap.containsKey(key)){
                        recordMap.put(key,1);
                    }else {
                        int value=recordMap.get(key);
                        recordMap.put(key,++value);
                    }
                }
            }
            Set<Map.Entry<Integer,Integer>> set=recordMap.entrySet();
            Iterator iterator=set.iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer,Integer> entry= (Map.Entry<Integer, Integer>) iterator.next();
                int value=entry.getValue();
                if(value >= 2){
                    result+=value*(value-1);
                }
            }
            recordMap.clear();
        }
        return result;
    }

    public static int cucalate(int []point1,int []point2){
        return (int) (Math.pow(point1[0]-point2[0],2)+Math.pow(point1[1]-point2[1],2));
    }
}
