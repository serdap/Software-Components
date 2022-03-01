package homework1;

import java.util.Scanner;

public class CheckerPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		for ( int row = 1; row <= size; row++) {
			for ( int col = 1; col <= size; col++) {
				if ( row % 2 == 0) {
				System.out.print(" "+"#");
				} else {
					System.out.print("#"+" ");
					}
			}
			System.out.println();
		}
	}
}