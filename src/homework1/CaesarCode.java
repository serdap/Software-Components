package homework1;

import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		inStr = inStr.toUpperCase();
		int inStrLen = inStr.length();
		String result = "";
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			result+= (char)(inStr.charAt(charIdx)+3);
		}
		System.out.println("The ciphertext string is: "+result);
	}

}

