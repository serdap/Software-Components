package homework4;

public class TestMyComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyComplex complex1 = new MyComplex();
		System.out.println(complex1);
		
		double real = 2.3;
		double imag = 3.7;
		MyComplex complex2 = new MyComplex(real, imag);
		System.out.println(complex2);
		complex2.setReal(4.9);
		complex2.setImag(8.2);
		System.out.println(complex2);
		
		complex2.setValue(34.56, 43.23);
		System.out.println(complex2);
		System.out.println(complex2.isReal());
		System.out.println(complex2.isImaginary());
		
		complex2.setImag(0);
		System.out.println(complex2.isReal());
		complex2.setReal(0);
		System.out.println(complex2.isImaginary());
		
		System.out.println(complex2.equals(complex1));
		complex2.setValue(3.4, 2.4);
		System.out.println(complex2.equals(complex1));
		
		System.out.println(complex2.magnitude());
		
		MyComplex complex3 = new MyComplex(4.5, 6.4);
		//System.out.println(complex2.addInto(complex3));		
		//System.out.println(complex2.addNew(complex3));
		
		System.out.println(complex2.divide(complex3));
	}

}