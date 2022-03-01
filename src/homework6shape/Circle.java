package homework6shape;

public class Circle extends Shape {
	private double radius = 1.0;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ",radius=" + radius + "]";
	}
}
