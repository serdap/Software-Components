package lab1;

public class HarmonicSum {
	public static void HarmonicSum(int a) {
		double sumLR = 0;
		double sumRL = 0;
		for (int i = 1; i <= a; i++) {
			sumLR += (double) 1 / i;
		}
		System.out.printf("Left-to-right harmonic sum %.15f\n", sumLR);

		for (int i = a; i >= 1; i--) {
			sumRL += (double) 1 / i;
		}
		System.out.printf("Right-to-left harmonic sum %.15f\n", sumRL);
		System.out.printf("Difference: %.15f\n", (sumLR - sumRL));
	}

	public static void main(String[] args) {}
}
