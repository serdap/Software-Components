package lab1;

public class Fibonacci {
	public static void Fibonacci(int a) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		System.out.println("The first" + nMax + " Fibonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			n++;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			sum += fn;
			System.out.print(fn + " ");
		}
		System.out.println();
		System.out.printf("The average is %.2f", (double) sum / 20);
	}
	
	public static void main(String[] args) {}
}
