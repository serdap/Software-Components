package homework1;

import java.util.Scanner;

public class CountVowelsDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		int inStrLen = inStr.length();
		inStr = inStr.toLowerCase();
		int numberofvowels = 0;
		int numberofdigits = 0;
		for (int charIdx = 0; charIdx <= inStrLen - 1; charIdx++) {
			if (inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '9') {
				numberofdigits += 1;
			}
			if (inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'i'
					|| inStr.charAt(charIdx) == 'o' || inStr.charAt(charIdx) == 'u') {
				numberofvowels += 1;
			}
		}
		;
		double vowelspercent = Math.round(numberofvowels * 1.0 / inStrLen * 10000.0) / 100.0;
		double digitspercent = Math.round(numberofdigits * 1.0 / inStrLen * 10000.0) / 100.0;
		System.out.println("Number of vowels: " + numberofvowels + " " + vowelspercent + "%");
		System.out.println("Number of digits: " + numberofdigits + " " + digitspercent + "%");

	}

}
