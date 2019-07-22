package leetcode;

import com.sun.org.apache.regexp.internal.recompile;

public class Q125 {

	/**
	 * 指针碰撞
	 * A man, a plan, a canal: Panama 结果为true
	 * @param args
	 */
	public static void main(String[] args) {
		String string="@@...ab **((a.%%^&";
		//System.out.println();
		System.out.println(isPalindrome(string));
	}
	
	public static boolean isPalindrome(String s) {
		  if(s == null) {
			  return false;
		  }
		  s=s.toLowerCase();
	      int start=0;
	      int end=s.length()-1;
	      while(start <= end) {
	    	  char indexStart=s.charAt(start);
	    	  char indexEnd=s.charAt(end);
	    	  while(!(indexStart>='0' && indexStart<='9' 
	    			  || indexStart>='a' && indexStart<='z') && start<end) {
	    		  start++;	 
	    		  indexStart=s.charAt(start);
	    	  }
	    	  while(!(indexEnd>='0' && indexEnd<='9' 
	    			  || indexEnd>='a' && indexEnd<='z') && end>start) {
	    		  end--;
	    		  indexEnd=s.charAt(end);
	    	  }
	    	  if(start==end) {
	    		  return true;
	    	  }
	    	  if(indexStart != indexEnd) {
	    		  return false;
	    	  }else {
	    		  start++;
	    		  end--;
	    	  }
	      }
	      return true;
	}

}
