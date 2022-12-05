package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Iteration
 */
public class BinaryTreeLevelOrderTraversal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//queue
	//current queue's lenth = curr list.length
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> output = new ArrayList<>();
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> currLevel = new ArrayList<>();
			
			while(size>0) {
				TreeNode currNode = q.poll();
				if(currNode!=null) {
					currLevel.add(currNode.val);
					q.add(currNode.left);
					q.add(currNode.right);
				}
				size--;
			}
			if(currLevel.size()!=0) {
				output.add(currLevel);
			}
		}
		return output;
		
	}
	
	

}
