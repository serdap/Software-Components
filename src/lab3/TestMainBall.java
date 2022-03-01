package lab3;

public class TestMainBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball1 = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
		System.out.println(ball1);
		ball1.setX(80.0f);
		ball1.setY(35.0f);
		ball1.setRadius(5);
		ball1.setxDelta(4.0f);
		ball1.setyDelta(6.0f);
		System.out.println(ball1);
		System.out.println("x is: " + ball1.getX());
		System.out.println("y is: " + ball1.getY());
		System.out.println("radius is: " + ball1.getRadius());
		System.out.println("xDelta is: " + ball1.getxDelta());
		System.out.println("yDelta is: " + ball1.getyDelta());

		float xMin = 0.0f;
		float xMax = 100.0f;
		float yMin = 0.0f;
		float yMax = 50.0f;

		for (int i = 0; i < 15; i++) {
			ball1.move();
			System.out.println(ball1);
			float xNew = ball1.getX();
			float yNew = ball1.getY();
			int radius = ball1.getRadius();

			if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
				ball1.reflectHorizontal();
			}
			if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
				ball1.reflectVertical();
			}
		}
	}

}