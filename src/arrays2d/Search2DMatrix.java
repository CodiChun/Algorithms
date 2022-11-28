package arrays2d;

/*
 * top = 0, bottom = row.size
 * check each rows: row[0]<=target<=row[size-1]
 * 				 row[size-1]>target  -> bottom = row - 1
 * 				 ROW[0]<target -> top = row+1
 * 
 * o(logn + logm)
 * o(1)
 * 
 */
public class Search2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		//comfirm the row
		int top = 0;
		int bottom = matrix.length-1;
		
		int left = 0;
		int right = matrix[0].length-1;
		
		int midRow = -1;
		
		boolean foundRow = false;
		while(top<=bottom) {
			midRow = top + (bottom-top)/2;
			if(matrix[midRow][0] <= target && matrix[midRow][right] >= target) {
				foundRow = true;
				break;
			} else if(matrix[midRow][0] > target) {
				bottom = midRow - 1;
			} else {
				top = midRow +1;
				
			}
		}
		
		if(foundRow == false) {
			return false;
		}
		
		//Confirm the col
		while(left<=right) {
			int midCol = left + (right-left)/2;
			if(matrix[midRow][midCol] == target) {
				return true;
			} else if(matrix[midRow][midCol] > target){
				right = midCol-1;
			} else {
				left = midCol + 1;
			}
		}
		return false;
	}

}
