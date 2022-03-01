package homework4;

public class TestPolynomial {
	public static void main(String[] args) {
		MyPolynomial f1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial f2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4);
		System.out.println(f1.evaluate(3));
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f1.evaluate(1));
		System.out.println(f1.add(f2).toString());
		System.out.println(f1.multiply(f2).toString());
	}
}
