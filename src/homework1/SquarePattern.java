package homework1;
import java.util.Scanner; 
public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		for ( int row = 1; row <= size; row++) {
			for ( int col = 1; col <= size; col++) {
				System.out.print("# ");
			}
			System.out.println();
			
		}
		System.out.println();
		while_doSquarePattern(size);
	}
	
	public static void while_doSquarePattern (int size) {
		int row = 1;
		int col = 1;
		do {
			do {
				System.out.print("# ");
				col++;
			} while (col <= size);
			col = 1;
			System.out.println();
			row++;
		} while (row <= size );
	}
}