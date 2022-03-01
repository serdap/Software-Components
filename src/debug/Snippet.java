package debug;

public class Snippet {
	public static void CheckPassFail(int a) {
			System.out.println("The mark is " + a);
			if (a < 50) {
				System.out.println("FAIL");
			} else {
				System.out.println("PASS");
			}
			System.out.println("DONE");
		}
		public static void main(String[] args) {
			
		}
}

