package lab3;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}
	
	public double getRadius() {
		return radius;
	}
	
	/* 
	 * public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	 */	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color
				;
	}
	
	public String toString() {
		return "Circle[radius = " + radius + " color = " + color + "]";
	}
	
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	
	public String toString2() {
		return "Circle[radius" + radius + "]";
	}
}
