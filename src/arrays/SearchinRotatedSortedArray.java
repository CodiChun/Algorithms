package arrays;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr1 = new int[]{4,5,6,7,0,1,2};
	    int target1 = 0;
	    System.out.println(binarySearch(arr1, target1));
	    
	    int[] arr2 = new int[]{17, 20, 25, 78, 90, 101, -10, -2, 5};
	    int target2 = 20;
	    System.out.println(binarySearch(arr2, target2));

	}
	

    	
    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int m = (r-l)/2+l;
            if(arr[m]>=arr[l]){
                //left sorted part
                if(target<arr[l] || target>arr[m]){
                    l=m+1;
                } else {
                    r = m-1;
                } 
            }
            else if(arr[m]<arr[r]){
                //right sorted part
                if(target>arr[r] || target<arr[m]){
                    r=m-1;
                } else {
                    l=m+1;
                }
            }
            if(target == arr[m]){
                return m;
            }
            }
            return -1;
        }
    
 
}
