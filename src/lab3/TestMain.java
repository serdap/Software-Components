package lab3;

public class TestMain {
	public static void main(String[] args) {
		/*
		Circle circle1 = new Circle(1.1);
		System.out.println(circle1.toString2());
		Circle circle2 = new Circle();
		System.out.println(circle2.toString2());
		
		circle1.setRadius(2.2);
		System.out.println(circle1.toString2());
		System.out.println("radius is " + circle1.getRadius());
		
		System.out.printf("are is: %.2f%n", circle1.getArea());
		System.out.printf("circumference is : %.2f%n", circle1.getCircumference());
		*/
		/*
		Rectangle rectangle1 = new Rectangle(1.2 ,3.4 ) ;
		System.out.println( rectangle1.toString()); // t o S t ri n g ( )
		Rectangle rectangle2 = new Rectangle(); // d e f a u l t c o n s t r u c t o r
		System.out.println(rectangle2.toString() );
		// Test s e t t e r s and g e t t e r s
		rectangle1.setLength(5.6);
		rectangle1.setWidth(7.8);
		System.out.println(rectangle1); // t o S t ri n g ( )
		System.out.println( "length is : " + rectangle1.getLength());
		System.out.println("width is : " + rectangle1.getWidth());
		System.out.printf(" area is : %.2f%n" , rectangle1.getArea()) ;
		System.out.printf( " perimeter is : %.2f%n" , rectangle1.getPerimeter());
		*/
		
		//InvoiceItem inl1 = new InvoiceItem("A101" , "Pen Red" , 888 , 0.08);
		//System.out.println(inl1.getTotal());
		
		Account account1 = new Account ( "A101" , "Tan Ah Teck" , 88 ) ;
		System.out.println(account1.toString()) ; // t o S t ri n g ( ) ;
		Account account2 = new Account ( "A102" , "Kumar" ) ; // d e f a u l t b al a n c e
		System.out.println(account2);
		account1.transferTo(account2,8);
		System.out.println(account1.toString()) ;
		System.out.println(account2.toString()) ;
	}
}
