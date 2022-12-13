package string;

public class IPToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip = "0.0.255.255";
		long num = ip2long(ip);
		System.out.println(num);
		System.out.println(long2ip(num));

	}
	//		0   1    2     3
	//		[0],[0],[255],[255]
	//power:3   2    1     0
	//num+: 0,  0,  65280, 255
	//num = 0%256*(256^3) + 0%256*(256^2) + 0 + 255%256*(256^1) + 255%256*(256^0)
	
    public static long ip2long(String ip) {
        String[] part = ip.split("\\."); 
        long num = 0;
        for (int i = 0; i < part.length; i++) {
            int power = 3 - i; //3
            num += ((Integer.parseInt(part[i]) % 256 * Math.pow(256, power)));
        }
        return num;
    }
    
    public static String long2ip(long num) {
    	StringBuilder sb = new StringBuilder();
    	//3
    	sb.append((int)Math.floor(num / Math.pow(256, 3)));
    	//System.out.println("the num: " + Math.floor(num / Math.pow(256, 3)));
    	sb.append(".");
    	//System.out.println(sb.toString());
    	
    	//2
    	num %= Math.pow(256, 3);
    	sb.append((int)Math.floor(num / Math.pow(256, 2)));
    	//System.out.println("the num: " + Math.floor(num / Math.pow(256, 2)));
    	sb.append(".");
    	//System.out.println(sb.toString());
    	
    	//1
    	num %= Math.pow(256, 2);
    	sb.append((int)Math.floor(num / Math.pow(256, 1)));
    	//System.out.println("the num: " + Math.floor(num / Math.pow(256, 1)));
    	sb.append(".");
    	//System.out.println(sb.toString());
    	
    	//1
    	num %= Math.pow(256, 1);
    	sb.append((int)Math.floor(num / Math.pow(256, 0)));
    	//System.out.println("the num: " + Math.floor(num / Math.pow(256, 0)));
    	//System.out.println(sb.toString());
    	
    	return sb.toString();

    }

}
