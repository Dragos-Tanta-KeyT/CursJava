package curs7;

public class MethodOverload {

	public static void main(String[] args) {

		System.out.println(123);
		System.out.println("123");
		System.out.println(123.123);
		System.out.println('1');
		
		System.out.println(multiply(3, 3.5));
	}

	
	public static int multiply(int nr1 , int nr2) {
		return nr1*nr2;
	}
	public static double multiply(double nr1 , double nr2) {
		return nr1*nr2;
	}
	
	
}
