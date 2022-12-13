package string;

public class IsRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABCDEFG";
		String s2 = "DEFGABC";
		System.out.println(isRotated(s1, s2));
		System.out.println(areRotations(s1,s2));
		

	}
	
	public static boolean isRotated(String s1, String s2) {
		
		s1 = s1 + s1;
		
		for(int i = 0, j = i+s2.length(); j< s1.length(); i++, j++) {
			System.out.println(s1.substring(i, j));
			if(s1.substring(i, j).equals(s2)) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
    static boolean areRotations(String str1, String str2)
    {
        // There lengths must be same and str2 must be
        // a substring of str1 concatenated with str1.
        return (str1.length() == str2.length())
            && ((str1 + str1).indexOf(str2) != -1);
    }

}
