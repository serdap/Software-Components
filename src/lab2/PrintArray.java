package lab2;

import java.util.Scanner;

public class PrintArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintArray(sc);
	}

	public static void PrintArray(Scanner sc) {
		System.out.print("Enter the number of items : ");
		int n = sc.nextInt();
		System.out.print("Enter the value of all items ( separated by space ) : ");
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}
