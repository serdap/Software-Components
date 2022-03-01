package homework4;

public class MyPolynomial {
	private double[] coeffs;
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	public int getDegree() {
		return coeffs.length - 1;
	}

	public String toString() {
		String polynomial = "(" + coeffs[getDegree()] + ")X^" + getDegree();
		for (int i = getDegree() - 1; i >= 0; i--) {
			polynomial += " + (" + coeffs[coeffs.length - i - 1] + ")" + "X" + "^" + i;
		}
		return polynomial;
	}


	public double evaluate(double x) {
		double result = coeffs[getDegree()];
		for (int i = getDegree() - 1; 0 <= i; i--) {
			result = (result * x) + coeffs[i];
		}
		return result;
	}

	public MyPolynomial add(MyPolynomial right) {
		if (right.coeffs.length > coeffs.length) {
			double[] temp = new double[right.coeffs.length];
			for (int i = 0; i < coeffs.length; i++) {
				temp[i] += right.coeffs[i] + coeffs[i];
			}
			for (int i = coeffs.length; i < right.coeffs.length; i++) {
				temp[i] += right.coeffs[i];
			}
			coeffs = temp;
		} else {
			for (int i = 0; i < right.coeffs.length; i++) {
				coeffs[i] += right.coeffs[i];
			}
		}
		return this;

	}

	public MyPolynomial multiply(MyPolynomial right) {
		double[] temp = new double[coeffs.length + right.coeffs.length - 2];
		for (int k = 0; k < temp.length; k++) {
			for (int i = 0; i < coeffs.length; i++) {
				for (int j = 0; j < right.coeffs.length; j++) {
					if (i + j == k) {
						temp[k] += coeffs[i] * right.coeffs[j];
					}
				}
			}
		}
		return new MyPolynomial(temp);

	}
}
