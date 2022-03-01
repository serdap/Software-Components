package lab1;

import java.util.Scanner;

public class InputValidation {
	public static void InputValidation(Scanner sc) {
		int numberIn;
		boolean isValid = false;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			numberIn = sc.nextInt();
			if (numberIn == 10) {
				isValid = true;
				System.out.println("Valid!!!");
			} else {
				System.out.println("Invalid input, try again...");
			}

		} while (!isValid);
		sc.close();
	}
	
	public static void main(String[] args) {}
}
