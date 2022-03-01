package homework2;

import java.util.Scanner;

public class NumberSystemConversion {
	private final static String hexStr = "0123456789ABCDEF";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String inputStr = sc.nextLine();
		inputStr = inputStr.toUpperCase();
		System.out.print("Enter the input radix: ");
		int inRadix = sc.nextInt();
		System.out.print("Enter the ouput radix: ");
		int outRadix = sc.nextInt();
		
		boolean isValid = false;
		do {
			for (int i = 0; i < inputStr.length(); i++) {
				char ch = inputStr.charAt(i);
				int index = hexStr.indexOf(ch);
				if (index < inRadix) {
					isValid = true;
				} else {
					isValid = false;
					break;
				}
			}
			if (isValid == false) {
			System.out.println("Error input string of radix " + inRadix + " please enter again");
			System.out.println("Enter String: ");
			sc.next();
			inputStr = sc.nextLine();
			System.out.print("Enter the input radix: ");
			inRadix = sc.nextInt();
			System.out.print("Enter the ouput radix: ");
			outRadix = sc.nextInt();
			}

		} while (!isValid);
		System.out.printf("\"%1$s\" in radix %2$d is \"%3$s\" in radix %4$d.\n", inputStr, inRadix,
				toRadix(inputStr, inRadix, outRadix), outRadix);

	}

	public static String toRadix(String in, int inRadix, int outRadix) {
		String inRadixToDec = inRadix2Dec(in, inRadix);
		return dec2OutRadix(inRadixToDec, outRadix);
	}

	public static String dec2OutRadix(String in, int outRadix) {
		int decNum = Integer.parseInt(in);
		String outRadixStr = "";
		while (decNum > 0) {
			int temp = decNum % outRadix;
			outRadixStr = hexStr.charAt(temp) + outRadixStr;
			decNum /= outRadix;
		}
		return outRadixStr;
	}

	public static String inRadix2Dec(String in, int inRadix) {
		int decNum = 0;
		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			int index = hexStr.indexOf(ch);
			decNum += index * Math.pow(inRadix, in.length() - i - 1);

		}
		return "" + decNum;

	}

}