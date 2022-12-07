package tree;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftTreeValue {

	
	/*
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findBottomLeftValue(TreeNode root) {
    	
    	Queue<TreeNode> q = new LinkedList<>();
    	q.add(root);
    	TreeNode curr = null;
    	while(!q.isEmpty()) {
    		curr = q.poll();
    		q.add(curr.right);
    		q.add(curr.left);
    	}
    	return curr.val;
    }
}
