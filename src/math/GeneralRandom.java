package math;

/*
 * General random number whihout using library
 * Used LCG algorithm
 * https://en.wikipedia.org/wiki/Linear_congruential_generator
 * 
 */
public class GeneralRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generateRandom(10);
		System.out.println(generateRandom(10));

	}
	


	
	public static int generateRandom(int max) {

		int last = (int)(System.currentTimeMillis() % max );
		//System.out.println("my system time: " + System.currentTimeMillis());
		//System.out.println("my last: " + last);
		return nextInt(max, last);
	}
	
	public static int nextInt(int max, int last) {
		//x=(ax+c)mod m
		
		last = (last * 134456 + 8121) % 28411;
		//System.out.println("my last 2: " + last);
	    return last % max;
	}

}
