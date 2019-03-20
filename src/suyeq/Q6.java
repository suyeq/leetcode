package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-20
 * @time: 12:35
 */
public class Q6 {
    /**
     * L     D     R
     * E   O E   I I
     * E C   I H   N
     * T     S     G
     * @param args
     */
    public static void main(String[] args){
        String s="AB";
        System.out.println(convert(s,1));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }
        char[][] convertArray=new char[numRows][s.length()];
        StringBuilder stringBuilder=new StringBuilder();
        boolean point=true;
        int indexRow=0;
        int indexColumn=0;
        for (int i=0;i<s.length();i++){
            if (point){
                convertArray[indexRow][indexColumn]=s.charAt(i);
                if (indexRow == numRows-1){
                    point=false;
                    indexRow--;
                    indexColumn++;
                }else {
                    indexRow++;
                }
            }else {
                convertArray[indexRow][indexColumn]=s.charAt(i);
                if (indexRow == 0){
                    point=true;
                    indexRow++;
                }else {
                    indexRow--;
                    indexColumn++;
                }
            }
        }

        for (int i=0;i<convertArray.length;i++){
            for (int j=0;j<convertArray[i].length;j++){
                if (convertArray[i][j] != 0){
                    stringBuilder.append(convertArray[i][j]);
                }
                System.out.print(convertArray[i][j]+" ");
            }
            System.out.println("");
        }

        return stringBuilder.toString();
    }
}
