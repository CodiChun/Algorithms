package string;

public class IsRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDEFG";
		String s2 = "DEFGABC";
		System.out.println(isRotated(s1, s2));
		

	}
	
	public static boolean isRotated(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
		s1 = s1 + s1;
		//System.out.println(s1.indexOf(s2));
		return s1.indexOf(s2)!=-1?true:false;
		
	}

}
