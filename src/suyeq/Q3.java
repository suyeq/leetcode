package suyeq;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Suyeq
 * @date: 2019-03-20
 * @time: 10:33
 */
public class Q3 {

    public static void main(String[] args){
        String a="";
        System.out.println(lengthOfLongestSubstring(a));
        System.out.println("djjsijfidsjh");
    }


    /**
     *滑动窗口法
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=-1;
        int maxLength=0;
        int []free=new int[256];
        while (start < s.length()){
            if (end+1 < s.length() && free[s.charAt(end+1)] == 0){
                free[s.charAt(++end)]++;
            }else {
                free[s.charAt(start++)]--;
            }
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
//    class Solution {
//        public:
//        int lengthOfLongestSubstring(string s) {
//            map<char,int> kmap;
//            int flag=0;
//            int maxsize=0;
//            if(s.length()==1)
//            {
//                return 1;
//            }
//            for(int i=0;i<s.length();i++)
//            {
//                if ((i<s.length()-1)&&(s[i]==s[i+1])&&(s[i]==' '))
//                {
//                    flag=1;
//                } else if((i==s.length()-1)&&(s[i]==' '))
//                {
//                    flag=1;
//                }else
//                {
//                    flag=0;
//                }
//            }
//            if(flag==1)
//            {
//                if(s.length()>=3)
//                {
//                    return 1;
//                }
//            }
//            if(flag==0)
//            {
//                for(int i=0;i<s.length();i++) {
//                    for (int j = i; j < s.length(); j++) {
//                        //cout<<"j=="<<j<<endl;
//                        pair<map<char, int>::iterator, bool> pair1 = kmap.insert(pair<char, int>(s[j], j));
//                        if (!pair1.second) {
//                            if (maxsize < kmap.size()) {
//                                maxsize = kmap.size();
//                                // cout<<"map 's size is"<<kmap.size()<<endl;
//                            }
//                            kmap.clear();
//                            break;
//                        }
//                    }
//                }
//            }
//            return maxsize;
//        }
//    };
}
