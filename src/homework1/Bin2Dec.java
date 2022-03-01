package homework1;

import java.util.Scanner;

public class Bin2Dec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a Binary String: ");
		String inStr = sc.next();
		sc.close();
		int inStrLen = inStr.length();
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			if (!((inStr.charAt(charIdx) == '0') || (inStr.charAt(charIdx) == '1'))) {
				System.out.println("invalid binary string");
				return;
			}
		}
		int toIntStr = Integer.parseInt(inStr);
		int binaryStr = toIntStr;
		int decimal = 0;
		int p = 0;
		while (true) {
			if (toIntStr == 0) {
				break;
			} else {
				int temp = toIntStr % 10;
				decimal += temp * Math.pow(2, p);
				toIntStr = toIntStr / 10;
				p++;
			}
		}
		System.out.println("The equivalent decimal number for binary " + binaryStr + " is: " + decimal);
	}
}
