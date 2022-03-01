package lab1;

import java.util.Scanner;

public class ReverseInt {
	public static void ReverseInt(Scanner sc) {
		int inNumber;
		System.out.println("Enter the number:");
		inNumber = sc.nextInt();
		int inDigit;
		int reNum = 0;
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			reNum = reNum * 10 + inDigit;
			inNumber /= 10;
		}
		System.out.println("The reverse is: " + reNum);
	}
	
	public static void main(String[] args) {
		
	}
}
