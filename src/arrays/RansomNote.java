package arrays;



/**
 * magazine = "aab"
 * 
 * map:a:0, b:1
 * int[26] a
 * 
 * ransomNote = "aaa"
 * 
 * o(n)
 * o(1)
 * 
 *
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean canConstruct(String ransomNote, String magazine) {
    	int[] chars = new int[26];
    	for(int i=0; i<magazine.length(); i++) {
    		chars[magazine.charAt(i)-'a'] ++;
    	}
    	
    	for(int i=0; i<ransomNote.length(); i++) {
    		if(chars[ransomNote.charAt(i)-'a'] <=0) {
    			return false;
    		}
    		chars[ransomNote.charAt(i)-'a'] --;
    	}
    	
    	return true;
        
    }

}
