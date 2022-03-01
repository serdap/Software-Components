package homework1;

import java.util.Scanner;

public class RadixN2Dec {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the radix: ");
		int radix = sc.nextInt();
		System.out.println("Input an Octal String: ");
		String inStr = sc.next();
		sc.close();
		if ( radix == 2) {
			Bin2Dec(inStr);	
		}
		if (radix == 16) {
			Hex2Dec(inStr);
		}
		if (radix == 8) {
			Oct2Dec(inStr);
		}
		
		
	}
	public static void Bin2Dec(String inStr) {
		int inStrLen = inStr.length();
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			if ( !((inStr.charAt(charIdx) == '0') 
				|| (inStr.charAt(charIdx) == '1' ))) {
				System.out.println("invalid binary string");
				return;
			}
		}
		int toIntStr = Integer.parseInt(inStr);
		int binaryStr = toIntStr;
		 int decimal = 0;
	        int p = 0;
	        while(true){
	            if(toIntStr == 0){
	                break;
	            } else {
	                int temp = toIntStr%10;
	                decimal += temp*Math.pow(2, p);
	                toIntStr = toIntStr/10;
	                p++;
	            }
	        }
	     System.out.println("The equivalent decimal number for binary "+binaryStr+" is: "+ decimal); 
	 }
	public static void Hex2Dec(String inStr) {
		int inStrLen = inStr.length();
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			if (!(((inStr.charAt(charIdx)) >= '0' && (inStr.charAt(charIdx)) <= '9')
			|| ((inStr.charAt(charIdx)>= 'A' && (inStr.charAt(charIdx)<= 'F'))
			|| ((inStr.charAt(charIdx)>= 'a' && (inStr.charAt(charIdx)<= 'f'))
					
					
				)))) {
				System.out.println("invalid hexadecimal string");
				return;
			}		
		}
		 String hstring = "0123456789ABCDEF";
		 inStr = inStr.toUpperCase();
	     int num = 0;
	     for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
	            char ch = inStr.charAt(charIdx);
	            int n = hstring.indexOf(ch);
	            num = 16*num + n;
	     }
	     System.out.print("The equivalent decimal number for hexadecimal "+inStr+" is: "+ num);
	}
	public static void Oct2Dec(String inStr) {
		int onum = Integer.parseInt(inStr);
		int num = 0;
        int p = 0;
        while(true){
            if(onum == 0){
                break;
            } else {
                int temp = onum%10;
                num += temp*Math.pow(8, p);
                onum = onum/10;
                p++;
            }
        }
        System.out.println("The equivalent decimal number "+inStr+" is: "+ num);
	}
}