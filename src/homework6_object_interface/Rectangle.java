package homework6_object_interface;

public class Rectangle implements GeometricObject {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return width * length;
	}
	@Override 
	public double getPerimeter() {
		return 2 * (width + length);
	}
	public String toString() {
		return "Rectangle[width=" + width + ",length=" + length + "]"; 
	}
}
