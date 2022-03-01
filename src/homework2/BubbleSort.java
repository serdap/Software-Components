package homework2;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 3,5,2,52,6 };
		bubbleSort(array);
		for (int i : array)
			System.out.print(i + " ");
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		boolean a = false;
		do {
			a = false;
			for (int i = 1; i < n; i++) {
				if (array[i - 1] > array[i]) {
					int tmp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tmp;
					a = true;
				}

			}
			n = n - 1;
		} while (a);
	}
}
