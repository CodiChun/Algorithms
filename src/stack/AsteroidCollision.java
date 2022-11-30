package stack;

import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    //5,-5
	// collision: arr[i] is negative, arr[i-1] is positive
	
    
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        stack.add(asteroids[0]);
        for(int i=1; i<asteroids.length; i++) {
        	int curr = asteroids[i];
        	while(!stack.isEmpty() && stack.peek() > 0 && curr < 0){
        		int pre = stack.pop();
        		curr = asteroids[i];
        		//curr = Math.max(pre, Math.abs(asteroids[i]));
        		if(pre == Math.abs(curr)){
        			curr = 0;
        		} else if (pre > Math.abs(curr)){
        			curr = pre;
        		} 
        	}
        	
        	if(curr!=0) {
        		stack.add(curr);
        	}
        	
        }
        
        int[] output = new int[stack.size()];
        for(int i = stack.size()-1; i>=0; i--) {
        	output[i] = stack.pop();
        }
        
        return output;

    }

}
