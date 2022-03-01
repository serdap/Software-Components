package lab1;

public class ExtractDigits {
	public static void ExtractDigits(int a) {
		while (a > 0) {
			int d = a % 10;
			a = a / 10;
			System.out.print(d + " ");
		}
	}
	public static void main(String[] args) {}
}
