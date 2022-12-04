package arrays;

public class BestTimetoBuyandSellStockwithCooldown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    /*
     *      1,2,4
     *      
	     * presold = sold
	     * sold = held + prices[i]
	     * held = max(held, reset - prices[i])
	     * reset = max(reset, presold)
     * 
     * max(sold, reset)
     * 
     * time:o(n)
     * space: o(1)
     * 
    */
	
    public int maxProfit(int[] prices) {
    	
    	int sold = Integer.MIN_VALUE, held = Integer.MIN_VALUE, reset = 0;
    	
    	for(int p : prices) {
    		int presold = sold;
    		sold = held + p;
    		held = Math.max(held, reset - p);
    		reset = Math.max(reset, presold);
    	}
    	
    	return Math.max(sold, reset);
    	

    }
    

}
