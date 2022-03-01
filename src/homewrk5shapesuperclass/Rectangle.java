package homewrk5shapesuperclass;

public class Rectangle extends Shape {
	private double length = 1.0f;
	private double width = 1.0f;

	public Rectangle() {
		super();
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, String color, boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
	}

}