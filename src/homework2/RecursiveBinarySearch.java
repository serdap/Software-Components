package homework2;
import java.util.Arrays;
import java.util.Scanner;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = inputArr(sc);
		System.out.println("Enter the key");
		System.out.print(binarySearch(arr, sc.nextInt()));
	}

	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
		if (toIdx >= fromIdx) {
			int middleIdx = (fromIdx + toIdx) / 2;

			if (key == array[middleIdx])
				return true;

			if (key < array[middleIdx])
				return binarySearch(array, key, fromIdx, middleIdx - 1);

			return binarySearch(array, key, middleIdx + 1, toIdx);
		}
		return false;
	}

	public static boolean binarySearch(int[] array, int key) {
		int firstIdx = 0;
		int lastIdx = array.length - 1;
		int middleIdx = (firstIdx + lastIdx) / 2;
		if (lastIdx >= firstIdx) {
			if (key == array[middleIdx]) {
				return true;
			}
			if (key > array[middleIdx]) {
				int[] tempArr = Arrays.copyOfRange(array, middleIdx + 1, lastIdx);
				return binarySearch(tempArr, key);
			} else {
				int[] tempArr = Arrays.copyOfRange(array, firstIdx, middleIdx - 1);
				return binarySearch(tempArr, key);
			}
		}
		return false;
	}
	
	public static int[] inputArr(Scanner sc) {
		System.out.println("Enter the length of the array ");
		int length = sc.nextInt();
		System.out.println("Enter all the values: ");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Array[" + i + "] = ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}