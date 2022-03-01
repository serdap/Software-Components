package lab2;
import java.util.Scanner;
public class GradesHistogram {
	public static int[] grades;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readGrades();
		horizontalPrint(grades);
		verticalPrint(grades);
	}

	public static void readGrades() {
		System.out.print("Enter the number of students: ");
		int numOfStu = sc.nextInt();
		grades = new int[numOfStu];
		for (int i = 1; i <= numOfStu; i++) {
			System.out.print("Enter the grade for student " + i + ": ");
			grades[i - 1] = sc.nextInt();
		}
	}

	public static void horizontalPrint(int[] array) {
		int[] arrCount = arrayOfNumStu(array);
		System.out.println("Horizontal histograms: ");
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				System.out.printf("%2s - %3s: ", i * 10, i * 10 + 9);

			} else {
				System.out.printf("%2s - %3s: ", i * 10, i * 10 + 10);
			}
			for (int j = 0; j < arrCount[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void verticalPrint(int[] array) {
		int[] arrCount = arrayOfNumStu(array);
		System.out.println("Vertical  histograms: ");
		int maximum = 0;
		for (int value : arrCount) {
			if (value > maximum) {
				maximum = value;
			}
		}
		for (int i = 0; i < maximum; i++) {
			for (int j = 0; j < 10; j++) {
				if (arrCount[j] > maximum - i - 1) {
					System.out.print(" *     ");
				} else {
					System.out.print("       ");
				}
			}
			System.out.println();
		}
		System.out.println("0-9   10-19  20-29  30-39  40-49  50-59  60-69  70-79  80-89  90-100");
	}

	public static int countStu(int[] array, int lowerBound, int upperBound) {
		int numOfStu = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] >= lowerBound) && (array[i] <= upperBound))
				numOfStu++;
		}
		return numOfStu;
	}

	public static int[] arrayOfNumStu(int[] array) {
		int[] outputArr = new int[10];
		for (int i = 0; i < 10; i++) {
			if (i < 9) {
				outputArr[i] = countStu(array, i * 10, i * 10 + 9);
			} else {
				outputArr[i] = countStu(array, i * 10, i * 10 + 10);
			}
		}
		return outputArr;
	}
}
