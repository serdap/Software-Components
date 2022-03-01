package lab2;
import java.util.Scanner;

public class GradesStatistics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grades(sc);
		sc.close();
	}
	
	public static void Grades(Scanner sc) {
		System.out.print("Enter the number of students : ");
		int n = sc.nextInt();
		int[] grades = new int[n];
		int sum = 0;
		if(n > 0) {
			for(int i = 0; i < n; i++) {
				System.out.print("Enter the grade for student "  + (i+1) + " : ");
				grades[i] = sc.nextInt();
				sum += grades[i];
			}
		}
		System.out.println("The average is : " + (double) sum / n);
		int max = 0;
		int min = grades[0];
		for(int i = 0; i < n; i++) {
			if(grades[i] < min) {
				min = grades[i];
			};
			if(grades[i] > max) {
				max = grades[i];
			}
		}
		System.out.println("The minimum is : " + min);
		System.out.println("The maximum is : " + max);
	}
}
