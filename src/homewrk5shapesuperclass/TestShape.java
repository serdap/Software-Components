package homewrk5shapesuperclass;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(4);
		Circle c3 = new Circle(3, "green", true);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c3.getArea());
		System.out.println(c3.getColor());
		System.out.println(c3.getRadius());
		
		c3.setColor("black");
		c3.setRadius(5);
		System.out.println(c3);
		
		System.out.println();
		System.out.println();
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2.3, 4.5);
		Rectangle r3 = new Rectangle(3, 4, "brown", true);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		System.out.println(r3.getArea());
		System.out.println(r3.getPerimeter());
		
		r3.setLength(12);
		r3.setWidth(14);
		System.out.println(r3.getArea());
		System.out.println(r3.getPerimeter());
		
		System.out.println();
		System.out.println();
		
		Square s1 = new Square();
		Square s2 = new Square(6);
		Square s3 = new Square(7, "Orange", true);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		
		s3.setLength(8);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		
		
	}

}