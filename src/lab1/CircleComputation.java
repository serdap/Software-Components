package lab1;

import java.util.Scanner;

public class CircleComputation {
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
	
	public static void main(String[] args) {}
}
