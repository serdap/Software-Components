package homework6_object_interface;

public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(5.4);
		System.out.println(circle1);
		System.out.println(circle1.getArea());
		System.out.println(circle1.getPerimeter());
		
		GeometricObject g1 = new Circle(4.6);
		System.out.println(g1);
		System.out.println(g1.getArea());
		System.out.println(g1.getPerimeter());
		
		GeometricObject g2 = new Rectangle(4.5, 2.3);
		System.out.println(g2);
		System.out.println(g2.getArea());
		System.out.println(g2.getPerimeter());
		
		
	}

}