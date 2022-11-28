package strings;

import java.util.regex.Pattern;

public class ValidateIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String validIPAddress(String queryIP) {
    	String interval4 = "[1-9] | [1-9][0-9] |1[0-9][0-9] | 2[0-4][0-9] | 25[0-5]";
    	Pattern patternIp4 = Pattern.compile("^("+interval4 + "\\.){3}" + interval4 + "$");
    	return 
    }

}
