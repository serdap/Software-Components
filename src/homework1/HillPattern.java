package homework1;

import java.util.Scanner;

public class HillPattern {
	static Scanner sc = new Scanner(System.in);
	static int numRows;
	public static void main(String[] args) {
		System.out.println("Enter the rows");
		numRows = sc.nextInt();
		//HillPatternA();
		//HillPatternB();
		HillPatternC();
		HillPatternD();
	}
	public static void HillPatternA() {
		for ( int row = 1; row <= numRows; row++) {
			for ( int col = 1; col <= 2*numRows-1; col++) {
				if ( (row +col >= numRows+1 )&& (row >= col - numRows + 1)) {
				System.out.print("# ");
				} else {
					System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
	public static void HillPatternB() {
		for ( int row = 1; row <= numRows; row++) {
			for ( int col = 1; col <= 2*numRows-1; col++) {
				if ( (row + col <= 2*numRows) && (row <= col)) {
				System.out.print("# ");
				} else {
					System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
	public static void HillPatternC() {
		for (int row = 1; row <=  2 * numRows - 1; row++) {
			for (int col = 1; col <=  2 * numRows - 1; col++) {
				if ((row + col <=  2 * numRows - 1 +  2 * numRows - 1 - numRows + 1)  
						&& (col - row <=  2 * numRows - 1 - numRows )
						&& (row - col <=  2 * numRows - 1 - numRows)
						&& (row + col >= numRows +1)) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void HillPatternD() {
		for (int row = 1; row <=  2 * numRows - 1; row++) {
			for (int col = 1; col <=  2 * numRows - 1; col++) {
				if ((row + col <= numRows + 1)  
						|| (row + col >= 2 * numRows - 1 + 2 * numRows - 1 - numRows +1)
						|| (row - col >= 2 * numRows - 1 - numRows)
						|| (col - row >= 2 * numRows - 1 - numRows )) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
