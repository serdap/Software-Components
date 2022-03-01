package homework2;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 0; i < 20; i++)
			System.out.println(factorial(i));
			System.out.println(fibonacci(6));
		    System.out.println(gcd(9, 3));
		// System.out.println(lengthOfRunningNum(12));

	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		if (a == b)
			return a;
		if (a > b) {
			return gcd(a - b, b);
		}
		return gcd(a, b - a);
	}

	public static int numOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static int lengthOfRunningNum(int n) {
		if (n == 1)
			return 1;
		return lengthOfRunningNum(n - 1) + numOfDigits(n);
	}

}