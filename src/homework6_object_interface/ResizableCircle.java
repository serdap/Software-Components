package homework6_object_interface;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}
	@Override
	public double resize(int percent) {
		return super.getRadius() * percent / 100.0;
	}
}