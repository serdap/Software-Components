package homework1;
import java.util.Scanner;
public class TriangularPatternX {
	public static void firstpattern(int size) {
        for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void secondparttern(int size) {
        for (int i = size; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void thirdparttern(int size) {
    	for (int i = 1; i <= size; ++i) {
            for (int j = 1; j <= size ; ++j) {
                if(j >= i) {
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

    public static void fourthparttern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 2 * (size - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        firstpattern(size);
        secondparttern(size);
        thirdparttern(size);
        fourthparttern(size);
    }
}