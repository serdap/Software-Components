package lab1;
import java.util.Scanner;

public class SumProductMinMax3 {
	public static void SumProductMinMax3(Scanner sc) {
		/* sc = new Scanner(System.in); */
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		int sum = n1 + n2 + n3;
		int product = n1 * n2 * n3;
		int min = n1;
		int max = n1;
		if (n2 < min) {
			min = n2;
		}
		if (n3 < min) {
			min = n3;
		}
		if (n2 > max) {
			max = n2;
		}
		if (n3 > min) {
			max = n3;
		}
		System.out.println("the sum is " + sum);
		System.out.println("the product is " + product);
		System.out.println("the min is " + min);
		System.out.println("the max is " + max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumProductMinMax3(sc);
	}
}
