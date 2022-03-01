package exe2;

public class Line {
	private Point begin;
	private Point end;

	public Line(Point begin, Point end) {
		// TODO Auto-generated constructor stub
		this.begin = begin;
		this.end = end;
	}

	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return begin.getX();
	}

	public int getBeginY() {
		return begin.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int beginX) {
		begin.setX(beginX);
	}

	public void setBeginY(int beginY) {
		begin.setY(beginY);
	}

	public void setBeginXY(int beginX, int beginY) {
		begin.setXY(beginX, beginY);
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
		return "Begin: " + begin.toString() + ", End: " + end.toString();
	}

	

}