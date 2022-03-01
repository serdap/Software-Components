package debug;

public class Debug {
	public static void checkPassFail(int a) {
		System.out.println("The mark is " + a);
		if (a < 50) {
			System.out.println("FAIL");
		} else {
			System.out.println("PASS");
		}
		System.out.println("DONE");
	}
	public static void main(String[] args) {
		int[] array = {1, 0, -50, 90, 101};
		
		for(int i = 0; i < 5; i ++) {
			checkPassFail(array[i]);
		}
	}
}
