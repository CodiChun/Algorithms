package arrays;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//7
	//i
	//
	//minVal: 7
	//maxProfit:0
	//time: o(n)
	//space:o(1)
	
	   public int maxProfit(int[] prices) {
	    	
	    	int minVal = Integer.MAX_VALUE;
	    	int maxProfit = 0;
	    	
	    	for(int price:prices) {
	    		if(price<minVal) {
	    			minVal = price;
	    		} else {
	    			maxProfit = Math.max(maxProfit, price - minVal);
	    		}
	    	}
	    	
	    	return maxProfit;
	        
	    }

}
