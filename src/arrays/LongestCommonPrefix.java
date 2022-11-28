package arrays;


/**
 * ["flower","flow","flight"]
 * flow -> fl
 * o(n*s), s is the avg length for strings
 * o(1)
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
    public String longestCommonPrefix(String[] strs) {
    	String lcp = strs[0];
    	for(String str: strs) {
    		while(!str.startsWith(lcp)) {
    			lcp = lcp.substring(0, lcp.length()-1);
    		}
    	}
    	
    	return lcp;

        
    }

}
