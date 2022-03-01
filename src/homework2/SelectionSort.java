package homework2;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = { 3,5,2,52,6 };
		selectionSort(array);
		for (int i : array)
			System.out.print(i + " ");
	}

	public static void selectionSort(int[] array) {
		int min = array[0];
		int minIdx = 0;
		boolean swapped = false;
		for (int i = 0; i < array.length - 1; i++) {
			min = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (min > array[j]) {
					minIdx = j;
					min = array[j];
					swapped = true;
				}
			}
			if (swapped) {
				int tmp = array[i];
				array[i] = array[minIdx];
				array[minIdx] = tmp;
				swapped = false;
			}
		}
	}
}