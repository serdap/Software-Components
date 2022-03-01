package lab2;
import java.util.Scanner;

public class ExercisesonMethod {
	public static void main(String[] args) {
		int[] array = {1,2, 3, 4};
		print(array);
	}
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array.length == 1) {
				System.out.print("[" + array[i] + "]");
				break;
			}
			if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else if (i == (array.length - 1)) {
				System.out.print(array[i] + "] ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
/*----------------*/	
	public static void reverse(int[] array) {
		if (array.length == 0) {
            System.out.println("Array is empty");
        }
        
        for(int i = 0; i < array.length / 2; i++) {
            int tmp     = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = tmp;
        }
        
        for (int i = 0; i < array.length; i++) {
			if (array.length == 1) {
				System.out.print("[" + array[i] + "]");
				break;
			}
			if (i == 0) {
				System.out.print("[" + array[i] + ", ");
			} else if (i == (array.length - 1)) {
				System.out.print(array[i] + "] ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
	public static void testReverse(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		int[] array1 = new int[sc.nextInt()];
		inputArr(array1, sc);
		reverse(array1);
		print(array1);
	}
/*------------------*/
	public static int exponent(int base, int exp) {
		int kq = 1;
		for(int i = 1; i <= exp; i++) {
			kq *= base;
		}
		return kq;
	}
	public static void testExponent(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int exp;
		int base;
		System.out.println("Enter the base: ");
		base = sc.nextInt();
		System.out.println("Enter the exponent: ");
		exp = sc.nextInt();
		System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
		sc.close();
	}
/*------------------------*/
	public static boolean hasEight(int number) {

		while(number > 0) {
			int d = number % 10;
			number = number / 10;
			if(d == 8) {
				return true;
			}
		}
		return false;
	}
	public static void magicSum(Scanner sc) {
		final int SENTINEL = -1;
		int number;
		System.out.print("Enter a positive integer(or -1 to end): ");
		number = sc.nextInt();
		int sum = 0;
		while (number != SENTINEL) {
			if (hasEight(number) == true)
				sum += number;
			System.out.print("Enter a positive integer(or -1 to end): ");
			number = sc.nextInt();
		}
		System.out.println("The magic sum is: " + sum);
	}
	public static void testMagicSum(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		magicSum(sc);
		
	}
/*--------------------------*/
	public static boolean contains(int[] array , int key) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == key){
				return true;
			}
		}
		return false;
	}
	public static void testContains(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int numValues = sc.nextInt();
		if (numValues == 0) {
			System.out.print("Empty array...");
		}
		System.out.println("Enter the key: ");
		int key = sc.nextInt();

		int[] array = new int[numValues];

		array = inputArr(array, sc);
		System.out.println(contains(array, key));

	}
/*--------------------*/
	public static int search(int[] array , int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void testSearch(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int numValues = sc.nextInt();
		if (numValues == 0) {
			System.out.print("Empty array...");
		}
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		int[] array = new int[numValues];
		array = inputArr(array, sc);
		System.out.println(search(array, key));

	}
/*----------------*/
	public static boolean equals(int[] array1 , int[] array2 ) {
		if(array1.length != array2.length) {
			return false;
		}
		else {
			for(int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}
	}
	public static void testEquals(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values of array 1: ");
		int numValues1 = sc.nextInt();
		int [] arr1 = new int[numValues1];
		inputArr(arr1,sc);
		System.out.println("Enter the number of values of array 2: ");
		int numValues2 = sc.nextInt();
		int [] arr2 = new int[numValues2];
		inputArr(arr2,sc);
		System.out.println(equals(arr1,arr2));
	
	}
/*------------------------*/
	public static boolean swap(int[] array1 , int[] array2 ) {
		if(array1.length != array2.length) {
			return false;
		}
		else {
			for (int i = 0; i < array1.length; i++) {
				int temp = array1[i];
				array1[i] = array2[i];
				array2[i] = temp;
			}
			return true;
		}
	}
	public static void testSwap(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values of the first array");
		int[] array1 = new int[sc.nextInt()];
		array1 = inputArr(array1, sc);
		System.out.println("Enter the number of values of the second array");
		int[] array2 = new int[sc.nextInt()];
		array2 = inputArr(array2, sc);
		if (swap(array1, array2)) {
		print(array1);
		print(array2);
		} else {
			System.out.println("Cannot swap");
		}

	}
/*-------------------*/
	public static int[] copyOf(int[] array , int newLength) {
		int[] arrnew = new int[newLength];
		for(int i = 0; i < newLength; i++) {
			arrnew[i] = array[i];
		}
		return arrnew;
	}
	public static void testCopyOf(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		int[] array1 = new int[sc.nextInt()];
		array1 = inputArr(array1, sc);
		print(array1);
		System.out.println("Enter new length");
		print(copyOf(array1, sc.nextInt()));

	}
/*----------------------------*/
	public static String arrayToString(int[] array) {
		String arrStr = "";
		for (int i = 0; i < array.length; i++) {
			if (array.length == 1) {
				arrStr += "[" + array[i] + "]";
			} else if (i == array.length - 1) {
				arrStr += array[i] + "]";
			} else if (i == 0) {
				arrStr += "[" + array[i];
			} else {
				arrStr += array[i] + ",";
			}
		}
		return arrStr;
	}
	public static void testArrayToString(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int numValues = sc.nextInt();
		int[] array = new int[numValues];
		if (numValues == 0) {
			System.out.print("Empty array...");
		}
		array = inputArr(array, sc);
		System.out.println(arrayToString(array));
	}
/*-------------------------------*/
	public static int[] inputArr(int[] arr, Scanner sc) {
		System.out.println("Enter all the values: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Array[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}
}
