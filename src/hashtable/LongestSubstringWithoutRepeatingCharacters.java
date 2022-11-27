package hashtable;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// time: O(n)
	// space o(n)
	 public int lengthOfLongestSubstring(String s) {
		 int maxLen = 0;
		 Map<Character, Integer> seen = new HashMap<>();
		 
		 int l=0,r=0;
		 
		 while(l<s.length() && r<s.length()) {
			 if(seen.containsKey(s.charAt(r))) {
				 l = Math.max(l, seen.get(s.charAt(r)) + 1);
			 }
			 
			 seen.put(s.charAt(r), r);
			 
			 maxLen = Math.max(maxLen, r-l+1); 
			 r++;
			 
		 }
		 
		 return maxLen;
	 }
	

}
//0123
//abba
//  l
//   r
//
//len:2
//map:a:0,b:2
