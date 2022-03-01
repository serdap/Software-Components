package homework2;
public class DateUtil {
	public static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(2012));
		System.out.println(toString(2012, 2, 29));
		System.out.println(isValidDate(2099, 12, 32));
		System.out.println(getDayOfWeek(1982,4,24));
		System.out.println(getDayOfWeek(2000,1,1));
		System.out.println(getDayOfWeek(2054,6,19));
		System.out.println(toString(2012,2,14));
		
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		return false;
	}

	public static boolean isValidDate(int year, int month, int day) {
		if (year > 9999 || year < 1)
			return false;
		if (month > 12 || month < 1)
			return false;
		if (day > 31 || day < 1)
			return false;
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
			return false;
		if (month == 2 && isLeapYear(year) == true && day <= 29)
			return true;
		if (month == 2 && (isLeapYear(year) == false) && day > 28)
			return false;
		return true;

	}

	public static int getDayOfWeek(int year, int month, int day) {
		int numberOfYear = -1;
		int temp;
		if (year < 100)
			temp = year;
		else if (year >= 100 && year < 1000)
			temp = year / 10;
		else
			temp = year / 100;

		if (Math.abs(temp - 21) % 4 == 0)
			numberOfYear = 4;
		if (Math.abs(temp - 22) % 4 == 0)
			numberOfYear = 2;
		if (Math.abs(temp - 23) % 4 == 0)
			numberOfYear = 0;
		if (Math.abs(temp - 24) % 4 == 0)
			numberOfYear = 6;
		int[] nonLeapYearMonthTable = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int[] leapYearMonthTable = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int lastTwoDigitOfYear = year % 100;
		if (isLeapYear(year) == false)
			return (numberOfYear + lastTwoDigitOfYear + lastTwoDigitOfYear / 4 + nonLeapYearMonthTable[month - 1] + day)
					% 7;
		return (numberOfYear + lastTwoDigitOfYear + lastTwoDigitOfYear / 4 + leapYearMonthTable[month - 1] + day) % 7;
	}

	public static String toString(int year, int month, int day) {
		int intDayOfWeek = getDayOfWeek(year, month, day);
		String strDayOfWeek = "";
		switch (intDayOfWeek) {
		case 0:
			strDayOfWeek = "Sun";
			break;
		case 1:
			strDayOfWeek = "Mon";
			break;
		case 2:
			strDayOfWeek = "Tue";
			break;
		case 3:
			strDayOfWeek = "Wed";
			break;
		case 4:
			strDayOfWeek = "Thur";
			break;
		case 5:
			strDayOfWeek = "Fri";
			break;
		case 6:
			strDayOfWeek = "Sat";
			break;
		}
		return strDayOfWeek + " " + day + " " + strMonths[month - 1] + " " + year;
	}

}