package arrays;

import java.util.Arrays;


//Given an array of integers arr, you’re asked to calculate for each index i the product of all integers except the integer at that index (i.e. except arr[i]). Implement a function arrayOfArrayProducts that takes an array of integers and returns an array of the products.
//
//Solve without using division and analyze your solution’s time and space complexities.

//input:  arr = [8, 10, 2]
//output: [20, 16, 80] # by calculating: [10*2, 8*2, 8*10]
//
//input:  arr = [2, 7, 3, 4]
//output: [84, 24, 56, 42] # by calculating: [7*3*4, 2*3*4, 2*7*4, 2*7*3]

public class ArrayofArrayProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ad";
		System.out.println(s.contains("a"));

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
