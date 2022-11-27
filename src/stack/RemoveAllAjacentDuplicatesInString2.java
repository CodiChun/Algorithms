package stack;

import java.util.Stack;

public class RemoveAllAjacentDuplicatesInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Pair {
	    int count;
	    char c;
	    public Pair(char c, int count) {
	        this.c = c;
	        this.count = count;
	    }
	}
	
	// time:O(n)
	// space: o(n)
    public String removeDuplicates(String s, int k) {
    	
    	
    	Stack<Pair> stack = new Stack<>();
    	for(int i=0; i<s.length(); i++) {
    		if(stack.isEmpty() ||stack.peek().c != s.charAt(i)) {
    			stack.add(new Pair(s.charAt(i), 0));
    		} 
    		stack.peek().count += 1;
    		if(stack.peek().count == k) {
    			stack.pop();
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	while(!stack.empty()) {
    		Pair pair = stack.pop();
    		while(pair.count>0) {
    			sb.append(pair.c);
    			pair.count --;
    		}
    	}
    	
    	return sb.reverse().toString();
        
    }

}
