package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {

	/**
	 * [-1,0,1,2,-1,-4]
	 *  i
	 *     j
	 * sum:0
	 * need:0
	 * needs: 0, 
	 * 
	 * 1. sort
	 * 2. search for triplet which curr!=pre
	 * 3. help method: hashset(need), need = 0 - num1 - num2
	 * 		
	 * o(n^2)
	 * o(n)
	 * 
	 */
	

	List<List<Integer>> output = new ArrayList<>();
	
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	Arrays.sort(nums);
    	for(int i=0; i<nums.length && nums[i] <=0; i++) {
    		if(i==0 || nums[i] != nums[i-1]) {
    			search(i, nums);
    		}
    	}
    	return output;
    	
    }
    
    public void search(int i, int[] nums) {
    	Set<Integer> seen = new HashSet<>();
    	for(int j = i + 1; j<nums.length; j++) {
    		int need = 0-nums[i]-nums[j];
    		if(seen.contains(need)) {
    			output.add(Arrays.asList(nums[i], nums[j], need));
    			while(j<nums.length-1 && nums[j+1] == nums[j]) {
    				j++;
    			}
    		} 
    		seen.add(nums[j]);
    		
    	}
    }
    
    
}
