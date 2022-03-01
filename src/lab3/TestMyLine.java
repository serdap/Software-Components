package lab3;

public class TestMyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPoint begin = new MyPoint(4, 5);
		MyPoint end = new MyPoint(3, 4);
		MyLine line1 = new MyLine(begin, end);
		System.out.println(line1.getBegin());
		line1.setBeginXY(12, 9);
		System.out.println(line1.getBegin());
		System.out.println(line1.getEnd());

		MyLine line2 = new MyLine(2, 5, 1, 7);
		System.out.println(line2);
		System.out.println(line2.getEndXY()[0]);
		System.out.println(line2.getLength());
		System.out.println(line2.getGradient());
		System.out.println(line1.toString());

	}

}