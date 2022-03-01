package exe2;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Line l1 = new Line(0, 0, 3, 4);
		System.out.println(l1);

		Point p1 = new Point(4, 7);
		Point p2 = new Point(6, 8);
		Line l2 = new Line(p1, p2);
		
		System.out.println(l2);
		System.out.println(l2.getBeginX());
		System.out.println(l2.getBeginY());
		System.out.println(l2.getEndX());
		System.out.println(l2.getEndY());
		System.out.println(l2.getGradient());
		System.out.println(l2.getLength());
		System.out.println(l2.getBegin());
		System.out.println(l2.getEnd());

		l2.setBegin(new Point(2, 9));
		System.out.println(l2);
		l2.setEnd(new Point(24, 67));
		System.out.println(l2);
	}

}