package homework5;

public class TestCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder cylinder1 = new Cylinder();
		System.out.println("Cylinder:" + " radius = " + cylinder1.getRadius() + " height = " + cylinder1.getHeight()
				+ " base Area = " + cylinder1.getArea() + " volume = " + cylinder1.getVolume());
		
		Cylinder cylinder2 = new Cylinder(10.0);
		System.out.println("Cylinder:" + " radius = " + cylinder2.getRadius() + " height = " + cylinder2.getHeight()
		+ " base Area = " + cylinder2.getArea() + " volume = " + cylinder2.getVolume());
		
		Cylinder cylinder3 = new Cylinder(2.0, 10.0);
		System.out.println("Cylinder:" + " radius = " + cylinder3.getRadius() + " height = " + cylinder3.getHeight()
		+ " base Area = " + cylinder3.getArea() + " volume = " + cylinder3.getVolume());
		
		System.out.println(cylinder1.toString());
		System.out.println(cylinder2.toString());
		System.out.println(cylinder3.toString());		
	}

}