package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * map<pathsum, count>
 * 1,1,2,4  -> target 4
 * 1: 1, 2, 2, 4:1, 8:1
 * total:2
 * 
 * 
 *
 */
public class PathSum3 {

	Map<Long, Integer> map = new HashMap<>();
	int count = 0;
	
    public int pathSum(TreeNode root, int targetSum) {
    	search(root, targetSum, 0L);
    	return count;
    }
    
    public void search(TreeNode root, int targetSum, long currSum) {
    	if(root==null) {
    		return;
    	}
    	
    	currSum += root.val;
    	
    	if(currSum == targetSum) {
    		count++;
    	}
   
    	long more = currSum-targetSum;
    	if(map.containsKey(more)) {
    		count += map.get(more);
    	} 
    	
    	map.put(currSum, (map.getOrDefault(currSum, 0)+1));
    	
    	search(root.left, targetSum, currSum);
    	search(root.right, targetSum, currSum);
    	
    	map.put(currSum, (map.get(currSum)-1));
    	
    }
    

    
    


}
