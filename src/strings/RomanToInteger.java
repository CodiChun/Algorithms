package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Map<Character, Integer> roman = new HashMap<>();
	
	public void addRoman() {
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
        
        //50:5:1:1:1
	}
	
    public int romanToInt(String s) {
        addRoman();
        
    	int output = roman.get(s.charAt(0));//output:50
        System.out.println(output);
    	
        for(int i=1; i<s.length(); i++) {
        	int pre = roman.get(s.charAt(i-1));//pre:50, 5, 1
        	int curr = roman.get(s.charAt(i));//curr:5, 1, 1
        	if(pre>=curr) {//yes, yes
        		output += curr;//50 + 5 + 1 + 
        	} else {
        		output += (curr - pre);
        		output -= pre;
        	}
            System.out.println(output);
        }
        
        return output;
    }
	

}
