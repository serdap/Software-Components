package homework2;

public class FactorialInt {
	public static void main(String[] args) {
		System.out.println("\nFactorialInt");
		factorialInt(13);
	}
	
	public static void factorialInt(int n) {
		int temp = 1;
		boolean check = false;
		for (int i = 1; i <= n; i++) {
			temp *= i;
			if (!check)
				System.out.println("The factorial of " + i + " is " + temp);
			else
				System.out.println("The factorial of " + i + " is out of range");
			if (Integer.MAX_VALUE / temp < n -1)
				check = true;
		}
	}

}
