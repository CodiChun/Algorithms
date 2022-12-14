package dp;

/**
 * dp[n] = dp[n-1] + dp[n-2]
 * 
 * 1 -> 1
 * 2 -> 2
 * 3 -> dp[2] + dp[1]
 *
 *time:o(n)
 *space:o(n)
 */

public class ClimbingStairs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int climbStairs(int n) {
    	
    	if(n==1) {
    		return 1;
    	}
    	
        int[] dp = new int[n+1];
        
        dp[1] = 1;
        dp[2] = 2;

        
        for(int i=3; i<=n; i++) {
        	dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }

}
