package homework1;

import java.util.Scanner;

public class ExchangeCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		inStr = inStr.toUpperCase();
		int inStrLen = inStr.length();
		String result = "";
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			result += (char) ('A' + 'Z' - inStr.charAt(charIdx));
		}
		System.out.println("The ciphertext string is: " + result);
	}

}
