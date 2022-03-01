package homework4;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime tm1 = new MyTime(23,5,50);
		System.out.println(tm1);
		System.out.println(tm1.nextHour());
		System.out.println(tm1.nextMinute());
		System.out.println(tm1.nextSecond());
		System.out.println(tm1.previousHour());
		System.out.println(tm1.previousMinute());
		System.out.println(tm1.previousSecond());
	}
}
