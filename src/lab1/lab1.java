package lab1;

import java.util.Scanner;

public class lab1 {
	public static void main(String[] args) {
		// int mark = 3;
		// CheckPassFail(mark);
		// CheckOddEven(mark);
		// SumAverageRunningInt(1,100);
		// HarmonicSum(5000);
		// ComputePi(10000);
		// Fibonacci(3);
		Scanner sc = new Scanner(System.in);
		// ExtractDigits(892123);
		// SumProductMinMax3( sc);
		// CircleComputation( sc);
		// PensionContributionCalculator( sc);
		// PensionContributionCalculatorWithSentinel(sc);
		// ReverseInt(sc);
		// InputValidation(sc);
		AverageWithInputValidation(sc);
	}

	public static void CheckPassFail(int a) {
		System.out.println("The mark is " + a);
		if (a < 50) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		System.out.println("DONE");
	}

	public static void CheckOddEven(int a) {
		System.out.println("The number is" + a);
		if (a % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		System.out.println("BYE");
	}

	public static void PrintNumberInWord(int a) {
		switch (a) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
		}
	}

	public static void PrintDayInWord(int a) {
		switch (a) {
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Not avalid day");
		}
	}

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

	public static void Fibonacci(int a) {
		int n = 3;
		int fn;
		int fnMinus1 = 1;
		int fnMinus2 = 1;
		int nMax = 20;
		int sum = fnMinus1 + fnMinus2;
		System.out.println("The first" + nMax + " Fibonacci numbers are: ");
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		while (n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			n++;
			fnMinus2 = fnMinus1;
			fnMinus1 = fn;
			sum += fn;
			System.out.print(fn + " ");
		}
		System.out.println();
		System.out.printf("The average is %.2f", (double) sum / 20);
	}

	public static void ExtractDigits(int a) {
		while (a > 0) {
			int d = a % 10;
			a = a / 10;
			System.out.print(d + " ");
		}
	}

	public static void SumProductMinMax3(Scanner sc) {
		/* sc = new Scanner(System.in); */
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		int sum = n1 + n2 + n3;
		int product = n1 * n2 * n3;
		int min = n1;
		int max = n1;
		if (n2 < min) {
			min = n2;
		}
		if (n3 < min) {
			min = n3;
		}
		if (n2 > max) {
			max = n2;
		}
		if (n3 > min) {
			max = n3;
		}
		System.out.println("the sum is " + sum);
		System.out.println("the product is " + product);
		System.out.println("the min is " + min);
		System.out.println("the max is " + max);
	}

	public static void CircleComputation(Scanner sc) {
		System.out.print("Enter the radius : ");
		double r = sc.nextDouble();
		double d = 2 * r;
		double area = Math.PI * r * r;
		double p = 2 * Math.PI * r;
		System.out.printf("Diameter is : %.2f\n", d);
		System.out.printf("Area is : %.2f\n", area);
		System.out.printf("Circumference is : %.2f\n", p);

	}

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

	public static void ReverseInt(Scanner sc) {
		int inNumber;
		System.out.println("Enter the number:");
		inNumber = sc.nextInt();
		int inDigit;
		int reNum = 0;
		while (inNumber > 0) {
			inDigit = inNumber % 10;
			reNum = reNum * 10 + inDigit;
			inNumber /= 10;
		}
		System.out.println("The reverse is: " + reNum);
	}

	public static void InputValidation(Scanner sc) {
		int numberIn;
		boolean isValid = false;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			numberIn = sc.nextInt();
			if (numberIn == 10) {
				isValid = true;
				System.out.println("Valid!!!");
			} else {
				System.out.println("Invalid input, try again...");
			}

		} while (!isValid);
		sc.close();
	}

	public static void AverageWithInputValidation(Scanner sc) {
		final int NUMSTUDENTS = 3;
		int numberIn;
		boolean isValid;
		int sum = 0;
		double average;

		for (int studentNo = 1; studentNo <= NUMSTUDENTS; ++studentNo) {
			System.out.println("Enter the mark(0-100) for student " + studentNo);
			isValid = false;
			do {
				numberIn = sc.nextInt();
				if ((numberIn < 0) || (numberIn > 100)) {
					System.out.println("Invalid input, try again...");
				} else {
					sum += numberIn;
					isValid = true;
				}
			} while (!isValid);
		}
		average = (sum * 1.0) / NUMSTUDENTS;
		System.out.println("The average is: " + Math.round(average * 100.0) / 100.0);
		sc.close();
	}
}
