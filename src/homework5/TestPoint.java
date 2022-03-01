package homework5;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D(3.7f, 5.6f);
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p2.getXY()[0]);
		System.out.println(p2.getXY()[1]);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		p2.setX(34);
		p2.setY(23);
		System.out.println(p2);
		p2.setXY(12, 43);
		System.out.println(p2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Point3D p3 = new Point3D(3.2f, 4.6f, 7.8f);
		Point3D p4 = new Point3D(12.3f, 3.7f, 15.2f);
		System.out.println(p3);
		System.out.println(p4);
		
		System.out.println(p4.getX());
		System.out.println(p4.getY());
		System.out.println(p4.getZ());
		
		p4.setX(4.5f);
		p4.setY(7.1f);
		p4.setZ(1.2f);
		System.out.println(p4);
	}

}