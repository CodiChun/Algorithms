package arrays;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//time: o(n)
	//space:o(1)
    public int minMoves(int[] nums) {
    	int min = Integer.MAX_VALUE;
    	int oriSum = 0;
    	
    	for(int num:nums) {
    		min = Math.min(min, num);
    		oriSum += num;
    	}
    	
    	int eqlSum = 0;
    	for(int i=0; i<nums.length; i++) {
    		eqlSum += min;
    	}
    	
    	return oriSum - eqlSum;
        
    }

}
