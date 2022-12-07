package math;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 10;
		swapNums(a, b);
		System.out.println("a: "+a+", b: "+b);

	}
	
	
	public static void swapNums(int a, int b) {
		b = a+b;
		a = b-a; //a=a+b-a
		b = b-a; //b=b+a-b
	}

}
