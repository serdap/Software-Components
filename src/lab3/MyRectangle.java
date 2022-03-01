package lab3;

public class MyRectangle {
	private MyPoint e1;
	private MyPoint e2;

	public MyRectangle(int x1, int y1, int x2, int y2) {
		e1 = new MyPoint(x1, y1);
		e2 = new MyPoint(x2, y2);
	}

	public MyRectangle(MyPoint e1, MyPoint e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	public double getArea() {
		return Math.abs((e1.getX() - e2.getX()) * (e1.getY() - e2.getY()));
	}
	
	public double getPerimeter() {
		int length = Math.abs(e1.getX() - e2.getX());
		int width = Math.abs(e1.getY() - e2.getY());
		return (length + width) * 2;
	}
	
	public String toString() {
		return "My Rectangle[e1 = " + e1.toString() + ", e2 = " + e2.toString() + "]";
	}

}