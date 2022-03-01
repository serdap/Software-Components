package exe2;

public class LineSub extends Point {
	Point end;

	public LineSub(int beginX, int beginY, int endX, int endY) {
		// TODO Auto-generated constructor stub
		super(beginX, beginY);
		end = new Point(endX, endY);
	}

	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	
	public Point getBegin() {
		return new Point(super.getX(), super.getY());
	}

	public void setBegin(Point begin) {
		super.setXY(begin.getX(), begin.getY());
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return super.getX();
	}

	public int getBeginY() {
		return super.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		super.setX(beginX);
	}

	public void setBeginY(int beginY) {
		super.setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		super.setXY(beginX, beginY);
	}
	
	public void setEndX(int endX) {
		end.setX(endX);
	}

	public void setEndY(int endY) {
		end.setY(endY);
	}

	public void setEndXY(int endX, int endY) {
		end.setXY(endX, endY);
	}
	
	public double getLength() {
		int xDiff = Math.abs(getBeginX() - getEndX());
		int yDiff = Math.abs(getBeginY() - getEndY());
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	
	public double getGradient() {
		int xDiff = Math.abs(getBeginX() - getEndX());
		int yDiff = Math.abs(getBeginY() - getEndY());
		return Math.atan2(yDiff, xDiff);
	}
	
	public String toString() {
		return "Begin: " + super.toString() + ", End: " + end.toString();
	}
	

}