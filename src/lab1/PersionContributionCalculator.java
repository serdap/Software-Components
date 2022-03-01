package lab1;

import java.util.Scanner;

public class PersionContributionCalculator {
	public static void PensionContributionCalculator(Scanner sc) {
		System.out.print("Enter the monthly salary : ");
		int salary = sc.nextInt();
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		double employeeCtb;
		double employerCtb;
		double totalCtb;
		if (age <= 55) { // 55 and below
			employeeCtb = salary * 0.20;
			employerCtb = salary * 0.17;
		} else if (age <= 60) { // ( 6 0 , 6 5]
			employeeCtb = salary * 0.13;
			employerCtb = salary * 0.13;
		} else if (age <= 65) { // ( 5 5 , 6 0]
			employeeCtb = salary * 0.075;
			employerCtb = salary * 0.09;
		} else { // above 65
			employeeCtb = salary * 0.05;
			employerCtb = salary * 0.075;
		}
		totalCtb = employeeCtb + employerCtb;
		System.out.printf("The employee’s contribution is : %.2f\n", employeeCtb);
		System.out.printf("The employer’s contribution is : %.2f\n", employerCtb);
		System.out.printf("The total contribution is : %.2f\n", totalCtb);
	}
	
	public static void PensionContributionCalculatorWithSentinel(Scanner sc) {
		System.out.print("Enter the monthly salary (or -1 to end :");
		int salary = sc.nextInt();
		while (salary != -1) {
			System.out.print("Enter the age : ");
			int age = sc.nextInt();
			double employeeCtb;
			double employerCtb;
			double totalCtb;
			if (age <= 55) { // 55 and below
				employeeCtb = salary * 0.20;
				employerCtb = salary * 0.17;
			} else if (age <= 60) { // ( 6 0 , 6 5]
				employeeCtb = salary * 0.13;
				employerCtb = salary * 0.13;
			} else if (age <= 65) { // ( 5 5 , 6 0]
				employeeCtb = salary * 0.075;
				employerCtb = salary * 0.09;
			} else { // above 65
				employeeCtb = salary * 0.05;
				employerCtb = salary * 0.075;
			}
			totalCtb = employeeCtb + employerCtb;
			System.out.printf("The employee’s contribution is : %.2f\n", employeeCtb);
			System.out.printf("The employer’s contribution is : %.2f\n", employerCtb);
			System.out.printf("The total contribution is : %.2f\n", totalCtb);
			System.out.print("Enter the monthly salary (or -1 to end :");
			salary = sc.nextInt();
		}
		System.out.println("BYE");
	}
	public static void main(String[] args) {}
}
