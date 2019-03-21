package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-21
 * @time: 15:04
 */
public class Q10 {
    public static void main(String[] args){
        System.out.println(isMatch("abv",".*"));
    }

    public static boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        boolean[][] memory = new boolean[sLen+1][pLen+1];
        memory[0][0] = true;
        for(int i = 0; i <= sLen; i++) {
            for(int j = 1; j <= pLen; j++) {
                if(p.charAt(j-1) == '*') {
                    memory[i][j] = memory[i][j-2] || (i > 0 && (s.charAt(i-1) == p.charAt(j-2) ||
                            p.charAt(j-2) == '.') && memory[i-1][j]);
                }else {
                    memory[i][j] = i > 0 && (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.')
                            && memory[i-1][j-1];
                }
            }
        }
        return memory[sLen][pLen];
    }
}
