package lab3;

public class TestTime {
	public static void main( String[] args) {
		// Test c o n s t r u c t o r s and t o S t ri n g ( )
		Time time1 = new Time (1, 2, 3 ) ;
		System.out.println(time1.toString()) ; // t o S t ri n g ( )
		// Test S e t t e r s and G e t t e r s
		time1.setHour(4 ) ;
		time1.setMinute(5 ) ;
		time1.setSecond(6 ) ;
		System.out.println(time1.toString() ) ; // t o S t ri n g ( )
		System.out.println("Hour : " + time1.getHour()) ;
		System.out.println("Minute : " + time1.getMinute()) ;
		System.out.println("Second : " + time1.getSecond()) ;
		// Test setTime ( )
		time1.setTime(23 , 59 , 58 ) ;
		System.out.println(time1.toString() ) ; // t o S t ri n g ( )
		// Test nextSecond ( ) ;
		System.out.println(time1.nextSecond()) ;
		System.out.println(time1.nextSecond().nextSecond()) ;
		// Test p r e vi o u s S e c o n d ( )
		System.out.println(time1.previousSecond()) ;
		System.out.println(time1.previousSecond().previousSecond()) ;
		}
}
