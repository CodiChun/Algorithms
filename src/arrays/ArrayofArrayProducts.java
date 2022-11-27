package arrays;

import java.util.Arrays;

public class ArrayofArrayProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  static int[] arrayOfArrayProducts(int[] arr) {
		    
		    if(arr.length <= 1){
		      return new int[0];
		    }
		    

		    int[] before = new int[arr.length];
		    int[] after = new int[arr.length];
		    
		    before[0] = 1;

		    for(int i=1; i<arr.length; i++){
		      before[i] = arr[i-1] * before[i-1]; 
		    }
		    //System.out.println(Arrays.toString(before));
		    
		    after[arr.length-1] = 1;
		     for(int i=arr.length-2; i>=0; i--){
		      after[i] = arr[i+1] * after[i+1]; 
		    }
		    //System.out.println(Arrays.toString(after));
		    
		    
		    int[] output = new int[arr.length];
		    for(int i=0; i<arr.length; i++){
		      output[i] = before[i] * after[i]; 
		    }
		    //System.out.println(Arrays.toString(output));
		    
		    return output;
		  }

}
