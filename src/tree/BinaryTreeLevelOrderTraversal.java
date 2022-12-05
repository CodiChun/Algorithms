package tree;

import java.util.ArrayList;
import java.util.List;

/*
 * Reucurtion
 */
public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//list[1:...., 2:....]
	//0,1,2 ->size:3
	
	List<List<Integer>> levels = new ArrayList<>();
	
	//recurtion
    public List<List<Integer>> levelOrder(TreeNode root) {
    	if(root == null) {
    		return levels;
    	}
    	dfs(root, 0);
    	return levels;
        
    }
    
    public void dfs(TreeNode node, int level) {
    	
    	if(node == null) {
    		return;
    	}
    	
    	if(level == levels.size()) {
    		levels.add(new ArrayList<Integer>());
    	}
    	
    	levels.get(level).add(node.val);
    	
    	dfs(node.left, level+1);
    	dfs(node.right, level+1);
    	
    }
    
    

}
