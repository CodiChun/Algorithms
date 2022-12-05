package dp;

public class PaintHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//[17,2,17],
	//[16,16,5],
	//[14,3,19]
	//

	/*
	//[17,2,17],
	//[18,33,7],
	//[21,10,37]
	 * 
	 * 0: 1, 2
	 * 1: 0, 2
	 * 2: 0, 1

	o(n)
	o(1)
	*/
    public int minCost(int[][] costs) {
    	int rows = costs.length;
    	int cols = costs[0].length;
        for(int r = 1; r<rows; r++) {
        	costs[r][0] += Math.min(costs[r-1][1], costs[r-1][2]);
        	costs[r][1] += Math.min(costs[r-1][0], costs[r-1][2]);
        	costs[r][2] += Math.min(costs[r-1][0], costs[r-1][1]);	
        }
        int min = Integer.MAX_VALUE;
        for(int c = 0; c<3; c++) {
        	min = Math.min(min, costs[rows-1][c]);
        }
        return min;
    }

}
