package suyeq;

/**
 * @author: 苍术
 * @date: 2019-07-10
 * @time: 10:00
 */
public class Q74 {

    /**
     * [1,   3,  5,  7],
     * [10, 11, 16, 20],
     * [23, 30, 34, 50]
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0){
            return false;
        }
        int row=0;
        int column=matrix[0].length-1;
        while (row>=0 && row <= matrix.length-1 && column>=0 && column<=matrix[0].length-1){
            if (matrix[row][column] >target){
                column--;
            }else if (matrix[row][column] <target){
                row++;
            }else if (matrix[row][column] == target){
                return true;
            }
        }
        return false;
    }


    public static void main(String []args){
        int c[][]={{1,3,5,7},{10, 11, 16, 20},{23, 30, 34, 50}};
        System.out.println(searchMatrix(c,7));
    }

}
