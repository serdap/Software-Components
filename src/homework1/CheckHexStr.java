package homework1;

import java.util.Scanner;

public class CheckHexStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		int inStrLen = inStr.length();
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			if (!(((inStr.charAt(charIdx)) >= '0' && (inStr.charAt(charIdx)) <= '9')
			|| ((inStr.charAt(charIdx)>= 'A' && (inStr.charAt(charIdx)<= 'F'))
			|| ((inStr.charAt(charIdx)>= 'a' && (inStr.charAt(charIdx)<= 'f'))
					
					
				)))) {
				System.out.println(inStr+" is NOT a hex string");
				return;
			}		
		}
		System.out.println(inStr+" is a hex string");

		}
	}


