package strings;

public class MultiplyStrings {

	public static void main(String[] args) {
		
	}
	
	/* place: j+i 
	 *  2 1 0
	 *  
	 *  1 2 3
	 *    j
	 *  4 5 6
	 *      i
	 *      
	 *  7 3 8
	 *    2
	 *  
	 *  int[num1.length + num2.length+1];
	 *  
	 *  [5608800]
	 *  [0056088]
	 *  
	 *  [8806500]
	 *         i
	 *  
	 *  while: ignore leading 0s
	 *  
	 * o(nm)
	 * o(n+m)
	 *  
	 *  1 8
	 *    i+j
	 */
	
    public String multiply(String num1, String num2) {
    	
    	if(num1.equals("0") || num2.equals("0")) {
    		return "0";
    	}
    	
    	int[] ans = new int[num1.length() + num2.length() + 1];
    	
    	StringBuilder sb1 = new StringBuilder(num1);
    	StringBuilder sb2 = new StringBuilder(num2);
    	sb1.reverse();
    	sb2.reverse();
    	
    	for(int i = 0; i<sb1.length(); i++) {
    		for(int j = 0; j<sb2.length(); j++){
    			int product = (sb1.charAt(i) - '0') * (sb2.charAt(j) - '0');
    			int rem = product % 10;
    			int carry = product / 10;
    			ans[j+i] += rem;
    			ans[j+i+1] += carry;
    			
    			checkCarry(ans, i+j);
    		}
    	}
    	
    	StringBuilder output = new StringBuilder();
    	
    	int i = ans.length-1;
		while(i>=0 && ans[i] == 0) {
			i--;
		}
    	while(i>=0) {
    		output.append(ans[i]);
    		i--;
    	}
  
    	return output.toString();
        
    }
    
    public void checkCarry(int[] arr, int index) {
    	if(arr[index] > 9) {
    		
    		int rem = arr[index] % 10;
    		int carry = arr[index]/10;
    		arr[index] = rem;
    		arr[index+1] += carry;
    	}
    }

}
