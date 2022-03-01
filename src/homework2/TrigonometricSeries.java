package homework2;

public class TrigonometricSeries {

	public static void main(String[] args) {
		double x = Math.PI / 6;
		int numTerms = 10;
		System.out.printf("sin(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), sin(x, numTerms));
		System.out.printf("cos(%1$d) = %2$f \n", (int) Math.round(x * 180 / Math.PI), cos(x, numTerms));

	}

	public static double calculateTerm(double x, int numTerms) {
		double term = 1D;
		for (int i = numTerms; i > 0; i--) {
			term *= x / i;
		}
		return term;
	}

	public static double sin(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, (2 * i + 1));
		}
		return result;
	}

	public static double cos(double x, int numTerms) {
		double result = 0D;
		for (int i = 0; i < numTerms; i++) {
			result += (i % 2 == 0 ? 1 : -1) * calculateTerm(x, 2 * i);
		}
		return result;
	}

}
