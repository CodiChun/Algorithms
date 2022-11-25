package arrays;


//You’re an engineer at a disruptive drone delivery startup and your CTO asks you to come up with an efficient algorithm that calculates the minimum amount of energy required for the company’s drone to complete its flight. You know that the drone burns 1 kWh (kilowatt-hour is an energy unit) for every mile it ascends, and it gains 1 kWh for every mile it descends. Flying sideways neither burns nor adds any energy.
//
//Given an array route of 3D points, implement a function calcDroneMinEnergy that computes and returns the minimal amount of energy the drone would need to complete its route. Assume that the drone starts its flight at the first point in route. That is, no energy was expended to place the drone at the starting point.
//
//For simplicity, every 3D point will be represented as an integer array whose length is 3. Also, the values at indexes 0, 1, and 2 represent the x, y and z coordinates in a 3D point, respectively.
//
//Explain your solution and analyze its time and space complexities.
//
//Example:
//input:  route = [ [0,   2, 10],
//                  [3,   5,  0],
//                  [9,  20,  6],
//                  [10, 12, 15],
//                  [10, 10,  8] ]
//output: 5
public class DroneFlightPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Algorithm:
	//use a loop to find the biggest negative energy
	//time: o(n)
	//space: o(1)
	public static int calcDroneMinEnergy(int[][] route) {
		    int count = 0;
		    int min = 0;
		    
		    if(route.length == 1){
		      return 0;
		    }
		    for(int i=1; i<route.length; i++){

		        count += (route[i-1][2]-route[i][2]);//
		      if(count<0){
		        
		        min = Math.min(min, count);
		      }
		      
		    }
		    return -1*min;
		  }

}
