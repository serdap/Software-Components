package homework1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		int inStrLen = inStr.length();
		String result = "";
		for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
			result += inStr.charAt(charIdx);
		}
		System.out.println("The reverse of the String " + "\"" + inStr + "\"" + " is " + "\"" + result + "\"");
	}

}
