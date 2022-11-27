package string;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String longestPalindrome(String s) {
    	
    	
    	String palindrome = "";
    	int longest=0;
    	
    	for(int i=0; i<s.length(); i++) {
    		//odd
    		int l = i;
    		int r = i;
    		while(l>=0 && r<=s.length()-1 && s.charAt(l) == s.charAt(r)) {
    			if(r-l+1 > longest) {
    				longest = r-l+1;
    				palindrome = s.substring(l, r+1);
    			}
    			r++;
    			l--;
    		}    		
    	}
    	
    	for(int i=1; i<s.length(); i++) {
    		//odd
    		int l = i-1;
    		int r = i;
    		while(l>=0 && r<=s.length()-1 && s.charAt(l) == s.charAt(r)) {
    			if(r-l+1 > longest) {
    				longest = r-l+1;
    				palindrome = s.substring(l, r+1);
    			}
    			r++;
    			l--;
    		}    		
    	}
    	return palindrome;
    }

}
