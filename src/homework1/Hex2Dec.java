package homework1;

import java.util.Scanner;

public class Hex2Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a hexadecimal String: ");
		String inStr = sc.next();
		sc.close();
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

}

