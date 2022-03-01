package homework6_movable;

public class Test {
	public static void main(String[] args) {
		MovablePoint O = new MovablePoint(1, 2, 3, 4);
		MovableCircle circlerMove1 = new MovableCircle(1, 2, 5, 6, 7); 
		System.out.println(O);
		O.moveDown();
		System.out.println(O);
		System.out.println(circlerMove1);
		circlerMove1.moveRight();
		System.out.println(circlerMove1);
	}
}
