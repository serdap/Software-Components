package lab1;

public class SumAverageRunningInt {
	public static void SumAverageRunningInt(int LOWERBOUND, int UPPERBOUND) {
		double sum = 0;
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
		}
		int numbers = UPPERBOUND - LOWERBOUND + 1;
		double kq = Math.round(sum / numbers * 100) / 100.0;
		;
		System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
		System.out.printf("%S\t%.2f\n", "The average is", kq);
		int sum2 = 0;
		while (number <= UPPERBOUND) {
			int tmp = number * number;
			sum2 += tmp;
			number++;
		}
		System.out.println("sum of the squares " + sum2);
	}
	public static void main(String[] args) {}
}
