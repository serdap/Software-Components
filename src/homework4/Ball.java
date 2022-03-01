package homework4;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;

	public Ball(float x1, float y1, int myRadius, float mySpeed, float myDirection) {
		x = x1;
		y = y1;
		radius = myRadius;
		xDelta =  mySpeed * (float) Math.cos(Math.toRadians(myDirection));
        yDelta = (-1) * mySpeed * (float) Math.sin(Math.toRadians(myDirection));

	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public float getxDelta() {
		return xDelta;
	}
	
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	
	public float getyDelta() {
		return yDelta;
	}
	
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	
	public String toString() {
		return "Ball[(" + x + ", " + y +", speed=(" + xDelta + ", "+yDelta+ ")]";
	}

}
