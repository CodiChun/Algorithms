package arrays2d;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
[3,-1,0,1],
[2,2, 1,-1],
[1,-1,2,-1],
[0,-1,3,4]

1. search all gates, store to *queue
2. expand from gates to distance 1...n, store visited gate to set

o(n*m)
o(n*m)
*/

public class WallAndGates {
	
	static int rows;
	static int cols;
	
	static final int EMPTY = Integer.MAX_VALUE;
	static final int GATE = 0;
	
	static final List<int[]> DIRECTIONS = Arrays.asList(
			new int[] {0,1}, 
			new int[] {0,-1}, 
			new int[] {1,0}, 
			new int[] {-1,0}
			);
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static void wallsAndGates(int[][] rooms) {
    	
    	rows = rooms.length;
    	cols = rooms[0].length;
    	
    	Queue<int[]> q = new LinkedList<>();
    	
    	for(int r = 0;r<rows; r++) {
    		for(int c = 0;c<cols; c++) {
    			if(rooms[r][c] == GATE) {
    				q.add(new int[] {r,c});
    			}
    		}
    	}
    	
    	while(!q.isEmpty()) {
    		int[] curr = q.poll();
    		int currR = curr[0];
    		int currC = curr[1];
    		int distance = rooms[currR][currC];
    		
    		for(int[] direction:DIRECTIONS) {
    			int neiR = currR + direction[0];
    			int neiC = currC + direction[1];
    			
    			if(neiR>=0 && neiC>=0 && neiR<rows && neiC<cols && rooms[neiR][neiC] == EMPTY) {
    				rooms[neiR][neiC] = distance + 1;
    				q.add(new int[] {neiR, neiC});
    			}
    		}    		
    	}

    }
    	
  
    

    	
    

}
