package lab3;

public class TestMyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTriangle triangle1 = new MyTriangle(1, 3, 4, 7, 2, 5);
		MyPoint v1 = new MyPoint(1, 2);
		MyPoint v2 = new MyPoint(-3, 1);
		MyPoint v3 = new MyPoint(2, -5);

		MyTriangle triangle2 = new MyTriangle(v1, v2, v3);
		System.out.println(triangle1.toString());
		System.out.println(triangle2.toString());
		System.out.println(triangle2.getPerimeter());
		System.out.println(triangle2.getType());

	}

}