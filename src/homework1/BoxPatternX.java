package homework1;

import java.util.Scanner;

public class BoxPatternX {
	public static void main(String[] args) {
        System.out.print("Enter a size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
		boxA(size);
		boxB(size);
		boxC(size);
		boxD(size);
    }
	
	public static void boxA(int size) {
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(col == 1 || row == 1 || col == size || row == size) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void boxB(int size) {
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if( row == 1 || col == row || row == size) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void boxC(int size) {
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if( row == 1 || col + row == size + 1 || row == size) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void boxD(int size) {
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if( row == 1 || col + row == size + 1 || row == size || col == row) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
