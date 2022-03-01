package homework5;

public class Cylinder extends Circle{
	private double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getRadius() * getRadius() * Math.PI * height;
	}
	@Override
	public double getArea() {
		return 2*Math.PI * getRadius() * height + 2 * Math.PI * getRadius() * getRadius() ;
	}
	@Override
	public String toString(){
	return "Cylinder : subclassof" + super.toString()+ "height=" + height;
	}
}
