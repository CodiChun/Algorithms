package arrays2d;

import java.util.Arrays;

public class MaximalSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {
				{'0','0','0','1'},
				{'1','1','0','1'},
				{'1','1','1','1'},
				{'0','1','1','1'},
				{'0','1','1','1'}
		};
		System.out.println(maximalSquare(matrix));
		

	}
	//bottom up dp
	//time: o(m*n)
	//space: o(1)
    public static int maximalSquare(char[][] matrix) {
    	
    	if(matrix.length == 0) {
    		return 0;
    	}
    	
    	int maxLen = 0;
    	
    	int col = matrix[0].length;
    	int row = matrix.length;
        for(int r = row-1; r>-1; r--) {
        	for(int c = col-1; c>-1; c--) {
        		if(c!=col-1 && r!=row-1 && matrix[r][c] == '1') {
            		int right = matrix[r][c+1];
            		int dig = matrix[r+1][c+1];
            		int below = matrix[r+1][c];
            		matrix[r][c] = (char)( (Math.min(below, Math.min(dig, right))) + 1);
        		}
        		maxLen = Math.max(maxLen, matrix[r][c] - '0');
        	}
        }
        //System.out.println(Arrays.deepToString(matrix));
        return maxLen * maxLen;
    }
    
    
}
