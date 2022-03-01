package homework1;

import java.util.Scanner;

public class PhoneKeyPad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string: ");
		String inStr = sc.next();
		sc.close();
		inStr = inStr.toLowerCase();
		for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
			if (inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'b' || inStr.charAt(charIdx) == 'c') {
				System.out.print(2);
			}
			if (inStr.charAt(charIdx) == 'd' || inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'f') {
				System.out.print(3);
			}
			if (inStr.charAt(charIdx) == 'g' || inStr.charAt(charIdx) == 'h' || inStr.charAt(charIdx) == 'i') {
				System.out.print(4);
			}
			if (inStr.charAt(charIdx) == 'j' || inStr.charAt(charIdx) == 'k' || inStr.charAt(charIdx) == 'l') {
				System.out.print(5);
			}
			if (inStr.charAt(charIdx) == 'm' || inStr.charAt(charIdx) == 'n' || inStr.charAt(charIdx) == 'o') {
				System.out.print(6);
			}
			if (inStr.charAt(charIdx) == 'p' || inStr.charAt(charIdx) == 'q' || inStr.charAt(charIdx) == 'r'
					|| inStr.charAt(charIdx) == 's') {
				System.out.print(7);
			}
			if (inStr.charAt(charIdx) == 't' || inStr.charAt(charIdx) == 'u' || inStr.charAt(charIdx) == 'v') {
				System.out.print(8);
			}
			if (inStr.charAt(charIdx) == 'w' || inStr.charAt(charIdx) == 'x' || inStr.charAt(charIdx) == 'y'
					|| inStr.charAt(charIdx) == 'z') {
				System.out.print(9);
			}
		}
		for (int charIdx = 0; charIdx <= inStr.length() - 1; charIdx++) {
			switch (inStr.charAt(charIdx)) {
			case 'a':
			case 'b':
			case 'c':
				System.out.print(2);
				break;
			case 'd':
			case 'e':
			case 'f':
				System.out.print(3);
				break;
			case 'g':
			case 'h':
			case 'i':
				System.out.print(4);
				break;
			case 'j':
			case 'k':
			case 'l':
				System.out.print(5);
				break;
			case 'm':
			case 'n':
			case 'o':
				System.out.print(6);
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				System.out.print(7);
				break;
			case 't':
			case 'u':
			case 'v':
				System.out.print(8);
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				System.out.print(9);
				break;

			}
		}
	}
}
