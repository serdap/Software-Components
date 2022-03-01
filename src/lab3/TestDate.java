package lab3;

public class TestDate {

	public static void main(String[] args) {
		Date Date1 = new Date(1, 2, 2014);
		System.out.println(Date1);
		Date1.setDay(12);
		Date1.setMonth(9);
		Date1.setYear(2099);
		System.out.println(Date1);
		System.out.println("Day is: "+ Date1.getDay());
		System.out.println("Month is: "+ Date1.getMonth());
		System.out.println("Year is: "+ Date1.getYear());
		Date1.setDate(2, 11, 2021);
		System.out.println(Date1);
	}

}