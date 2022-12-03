package arrays;

public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * 1,2,3,8,9
	 *       i
	 * 
	 * when [i+1]>[i], profit += [i+1]-i[i]
	 * 
	 * time:o(n)
	 * space:o(1)
	 * 
	 */
	
    public int maxProfit(int[] prices) {
    	
    	int profit = 0;
    	
    	for(int i =0; i<prices.length-1; i++) {
    		if(prices[i+1]>prices[i]) {
    			profit += prices[i+1] - prices[i];
    		}
    	}
    	
    	return profit;

    }
    
    

}
