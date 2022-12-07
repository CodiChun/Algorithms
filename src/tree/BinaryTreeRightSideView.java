package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * level
	 * Recursion
	 * 
	 * l0:1 list.size = 0
	 * l1:3,2 list.size =1
	 * 
	 * time: o(n)
	 * space: o(n)
	 * 
	 */
	
	List<Integer> rightSideNodes = new ArrayList<>();
	
    public List<Integer> rightSideView(TreeNode root) {
    	
    	if(root != null) {
    		bfs(root, 0);
    	}
        return rightSideNodes;
    }
    
    public void bfs(TreeNode root, int level) {
    	if(level == rightSideNodes.size()) {
    		rightSideNodes.add(root.val);
    	}
    	if(root.right!=null)
    		bfs(root.right, level+1);
    	if(root.left!=null)
    		bfs(root.left, level+1);
    }

}
