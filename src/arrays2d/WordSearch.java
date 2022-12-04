package arrays2d;

public class WordSearch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	char[][] myBoard;
	String myWord;
	int rows;
	int cols;
	//Set<int[]> path = new HashSet();
	
    public boolean exist(char[][] board, String word) {
    	this.myBoard = board;
    	this.myWord = word;
    	this.rows = board.length;
    	this.cols = board[0].length;
    	
    	char first = word.charAt(0);
    	for(int r=0; r<rows; r++) {
    		for(int c=0; c<cols; c++) {
    			if(board[r][c] ==  first) {
    				if(dfs(r,c,0)) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    	
        
    }
    
    public boolean dfs(int r, int c, int i) {
    	
    	
    	
    	if(i == myWord.length()) {
    		return true;
    	}
    	
    	if(r<0 || r>rows-1 || c<0 || c>cols-1 || myBoard[r][c] != myWord.charAt(i)) {
    		return false;
    	}
    	
    	myBoard[r][c] += 100;
    	
    	
    	boolean res = dfs(r+1, c, i+1) || dfs(r-1, c, i+1) ||
    	dfs(r, c+1, i+1) ||
    	dfs(r, c-1, i+1);
    	
    	myBoard[r][c] -= 100;
    
    	return res;
    	
    }

}
