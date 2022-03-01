package lab1;

public class ComputePi {
	public static void ComputePi(int a) {
		double sum = 0;
		for (int i = 1; i <= a; i += 2) {
			if (i % 4 == 1) {
				sum += (double) 1 / i;
			} else if (i % 4 == 3) {
				sum -= (double) 1 / i;
			} else {
				System.out.println(" Im p o s si bl e ! ! ! ");
			}
		}
		System.out.printf("Pi is %.15f", 4 * sum);
	}
	
	public static void main(String[] args) {}
}
