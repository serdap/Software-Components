package lab3;

public class MyPoint {
	private int x;
	private int y;

	public MyPoint() {
		x = 0;
		y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		return new int[] { x, y };
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(int x, int y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
	}

	public double distance(MyPoint another) {
		return Math.sqrt((x - another.getX()) * (x - another.getX()) + (y - another.getY()) * (y - another.getY()));
	}

	public double distance() {
		return Math.sqrt(x * x + y * y);
	}

}
