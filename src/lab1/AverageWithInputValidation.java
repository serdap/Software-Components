package lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
	public static void AverageWithInputValidation(Scanner sc) {
		final int NUMSTUDENTS = 3;
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;

		for (int studentNo = 1; studentNo <= NUMSTUDENTS; ++studentNo) {
			System.out.println("Enter the mark(0-100) for student " + studentNo);
			isValid = false;
			do {
				numberIn = sc.nextInt();
				if ((numberIn < 0) || (numberIn > 100)) {
					System.out.println("Invalid input, try again...");
				} else {
					sum += numberIn;
					isValid = true;
				}
			} while (!isValid);
		}
		average = (sum * 1.0) / NUMSTUDENTS;
		System.out.println("The average is: " + Math.round(average * 100.0) / 100.0);
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AverageWithInputValidation(sc);
	}
	
}
