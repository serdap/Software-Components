package homework2;

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println(linearSearch(array, 3));
		System.out.println(linearSearchIndex(array, 3));
	}
	public static int linearSearchIndex(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return i;
		}
		return -1;
	}
	public static boolean linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == key)
				return true;
		}
		return false;
	}
}
