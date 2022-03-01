package homework1;
import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size : ");
		int a = sc.nextInt();
		sc.close();
		System.out.println();
		//SquarePattern(a);
		//CheckerPattern(a);
		TimeTable(a);
	}
	
	public static void SquarePattern(int a) {
		
		for(int row = 1; row <= a; row++) {
			for(int col = 1; col <= a; col++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	
	public static void CheckerPattern(int a) {
		for(int row = 1; row <= a; row++) {
			for(int col = 1; col <= a; col++) {
				if((row + col) % 2 == 0) {
					System.out.print("#");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void TimeTable(int a) {
		System.out.format("   * |");
        for (int col = 1; col <= a; col++) {
            System.out.format("%4d", col);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int row = 1; row <= a; row++) {
            System.out.format("%4d |", row);
            for (int col = 1; col <= a; col++) {
                System.out.format("%4d", row * col);
            }
            System.out.println();
        }
	}
	
	
}
