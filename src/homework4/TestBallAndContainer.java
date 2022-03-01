package homework4;

public class TestBallAndContainer {
	public static void main(String[] args) {
		Ball ball = new Ball(50,45,5,14,28);
		Container box  = new Container(0,0,100,100);
		for(int step = 0; step < 100; step++) {
			ball.move();
			box.collidesWith(ball);
			System.out.println(ball);
			
		}
	}
}
