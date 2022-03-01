package homework2;
public class ExponentialSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(specialSeries(0.9, 10000));
	}

	public static double specialSeries(double x, int numTerms) {
		double specialSeriesNum = x;
		for (int i = 1; i <= numTerms; i++) {
			specialSeriesNum += countSeries(x, i);
		}
		return specialSeriesNum;
	}

	public static double countSeries(double x, int numTerms) {
		double countVar = 1.0;
		for (int i = 1; i <= numTerms; i++) {
			countVar *= (2 * i - 1) * 1.0 / (2 * i);
		}
		return countVar * Math.pow(x, 2 * numTerms + 1) / (2 * numTerms + 1);
	}

}