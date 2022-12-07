package arrays2d;

public class NumberofIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//1 -> 0
	//4 directions of it, change all 1->0
	
	
	int count;
	int rows;
	int cols;
    public int numIslands(char[][] grid) {
    	rows = grid.length;
    	cols = grid[0].length;
    	
    	for(int r = 0; r<rows; r++) {
    		for(int c = 0; c<cols; c++) {
    			if(grid[r][c] == '1') {
    				count ++;
    				checkNeightbors(grid, r, c);
    			}
    		}
    	}
    	return count;
    	
        
    }
    
    public void checkNeightbors(char[][] grid, int r, int c) {
    	
    	if(r<0 || c<0 || r>=rows || c>= cols || grid[r][c] == '0') {
    		return;
    	}
    	
    	grid[r][c] = '0';
    	
    	checkNeightbors(grid, r-1, c);
    	checkNeightbors(grid, r+1, c);
    	checkNeightbors(grid, r, c+1);
    	checkNeightbors(grid, r, c-1);
    }

}
