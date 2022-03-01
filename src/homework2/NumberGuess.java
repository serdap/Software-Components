package homework2;

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		int randomNumber = (int) (Math.random()*100);
		int count = 1;
		System.out.println("Key in your guess:");
		key = sc.nextInt();
		while (key != randomNumber) {
			if (key < randomNumber) {
				System.out.println("Try higher");
			}
			if (key > randomNumber) {
				System.out.println("Try lower");
			}
			count++;
			key = sc.nextInt();
		}
		System.out.println("You got it in " + count + " trials!");
	}

}