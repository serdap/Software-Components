package homework1;

import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string: ");
		String inputString = sc.nextLine();
		// testPalindromicWord(inputString);
		testPalindromicPhrase(inputString);
		
	}

	public static void testPalindromicPhrase(String inputString) {
		String tempStr = inputString;
		inputString = inputString.trim().toLowerCase().replaceAll(" ", "").replaceAll("\\p{Punct}", "");
		boolean isValid = true;
		int inputLength = inputString.length();
		for (int i = 0; i < inputLength; i++) {
			if (inputString.charAt(i) != inputString.charAt(inputLength - i - 1)) {
				isValid = false;
				break;
			}
		}

		if (isValid == true)
			System.out.print(tempStr + " is a palindrome");
		else
			System.out.print(tempStr + " is NOT a palindrome");
	}

	public static void testPalindromicWord(String inputString) {
		String tempStr = inputString;
		inputString = inputString.toLowerCase();
		int inputLength = inputString.length();
		boolean isValid = true;
		for (int i = 0; i < inputLength; i++) {
			if (inputString.charAt(i) != inputString.charAt(inputLength - i - 1)) {
				isValid = false;
				break;
			}
		}

		if (isValid == true)
			System.out.print(tempStr + " is a palindrome");
		else
			System.out.print(tempStr + " is NOT a palindrome");
	}

}