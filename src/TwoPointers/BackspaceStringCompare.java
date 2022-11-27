package TwoPointers;

/*
 * ab#c
 * s
 * skips:0
 * 
 * ad#c
 * t
 * skipt:0
 * 
 * 
 * time: o(n) n = maxLen(s,t)
 * space: o(1)
 */



public class BackspaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean backspaceCompare(String s, String t) {
    	
    	int p1 = s.length()-1;
    	int p2 = t.length()-1;
    	
    	int skips = 0;
    	int skipt = 0;
    	while(p1>=0 || p2>=0) {
    		
    		while(p1>=0) {
    			if(s.charAt(p1) == '#'){
    				skips ++;
    				p1 --;
    			} else {
    				if(skips>0) {
    					skips --;
    					p1 --;
    				} else {
    					break;
    				}
    			}
    		}
    		
    		while(p2>=0) {
    			if(t.charAt(p2) == '#'){
    				skipt ++;
    				p2 --;
    			} else {
    				if(skipt>0) {
    					skipt --;
    					p2 --;
    				} else {
    					break;
    				}
    			}
    		}
    		
    		
    		if((p1>=0) != (p2>=0)) {
    			return false;
    		}
    		
    		if(p1>=0 && p2>=0 && s.charAt(p1)!=t.charAt(p2)) {
    			return false;
    		}
    		p1--;
    		p2--;
    	}
    	
    	return true;
    	
 
    }
}
