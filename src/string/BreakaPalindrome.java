package string;

/**
 * 0123
 * abccba   6/2=3
 * 
 * aacaa
 * 
 * o(n)
 * o(1)
 * 
 *
 */
public class BreakaPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aacaa";
		System.out.println(breakPalindrome(s));

	}
	
    public static String breakPalindrome(String palindrome) {
    	
    	if(palindrome.length() <= 1) {
    		return "";
    	}
    	
    	StringBuilder sb = new StringBuilder(palindrome);
    	
    	int mid = palindrome.length()/2;
    	for(int i=0; i<mid; i++) {
    		if(palindrome.charAt(i)!='a'){
    			sb.setCharAt(i, 'a');
    			return sb.toString();
    		}
    	}
    	
    	sb.setCharAt(palindrome.length()-1, 'b');
    	return sb.toString();
    }

}
