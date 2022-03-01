package homework6_object_interface;

public class Circle implements GeometricObject {
	private double radius = 1.0;

	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + "]"; 
	}
}