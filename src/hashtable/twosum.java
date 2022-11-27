package hashtable;

import java.util.HashMap;
import java.util.Map;

/*
 * 2,7,11,15
 *   i
 * 
 * map(need, index):7:2, 
 * 
 * time: o(n)
 * space: o(n)
 */

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> needs = new HashMap<>();
    	
    	for(int i=0; i<nums.length; i++) {
    		int need = target - nums[i];
    		if(needs.containsKey(need)) {
    			return new int[] {needs.get(need), i};
    		}
    		needs.put(nums[i], i);
    	}
    	return null;
    	
        
    }

}
