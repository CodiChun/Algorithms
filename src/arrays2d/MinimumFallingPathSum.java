package arrays2d;

import java.util.Arrays;

/*
 * 2,1,3
 * 7,6,5     row1
 * 13,13,14
 * 
 * 
 * time: o(n^2)
 * space:o(1)
 * 
 * 
 * 7
 * 5
 * 6
 * 
 */



public class MinimumFallingPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int r=1; r<rows; r++) {
            for(int c=0; c<cols; c++) {
            	int top = matrix[r-1][c];
            	int left = top;
            	int right = top;
            	if(c-1>=0) {
            		//update left
            		left = matrix[r-1][c-1];
            	}
            	if(c+1<cols) {
            		//uodate right
            		right = matrix[r-1][c+1];
            	}
            	
            	matrix[r][c] = matrix[r][c] + Math.min(top, Math.min(left, right));
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        
        int minPath = Integer.MAX_VALUE;
        for(int c=0; c<cols; c++) {
        	minPath = Math.min(minPath, matrix[rows-1][c]);
        }
        return minPath;
    }
    
    

}
