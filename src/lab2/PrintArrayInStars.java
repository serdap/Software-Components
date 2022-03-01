package lab2;

import java.util.Scanner;

public class PrintArrayInStars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String NUM_ITEMS;
		System.out.print("Enter the number of items: ");
		NUM_ITEMS = sc.nextLine();
		while (!isPositiveInteger(NUM_ITEMS)) {
			System.out.print("Enter an integer >= 0 ");
			NUM_ITEMS = sc.nextLine();
		}
		if (NUM_ITEMS.equals("0")) {
			System.out.println("Empty array...");
			sc.close();
			return;
		}

		System.out.print("Enter the values of all items(non-negative number, separate by space): ");
		String temp = sc.nextLine();
		String[] items = temp.trim().split("\\s");
		while (items.length != Integer.parseInt(NUM_ITEMS)) {
			System.out.println("Enter " + NUM_ITEMS + " numbers please");
			temp = sc.nextLine();
			items = temp.trim().split("\\s");
			for (int i = 0; i < items.length; i++) {
				while (!isPositiveInteger(items[i])) {
					System.out.println("Please enter non-negative number: ");
					i = 0;
					temp = sc.nextLine();
					items = temp.trim().split("\\s");
				}
			}
		}
		sc.close();
		for (int i = 0; i < items.length; i++) {
			System.out.print(i + ": ");
			for (int starNo = 1; starNo <= Integer.parseInt(items[i]); starNo++) {
				System.out.print("*");
			}
			System.out.print("(" + Integer.parseInt(items[i]) + ")");
			System.out.println();
		}
	}

	public static boolean isPositiveInteger(String str) {
		try {
			int temp = Integer.parseInt(str);
			if (temp >= 0)
				return true;
			return false;

		} catch (NumberFormatException ex) {
			return false;
		}
	}

}

