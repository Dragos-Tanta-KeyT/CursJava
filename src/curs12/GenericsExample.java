package curs12;

public class GenericsExample {

	public static void main(String[] args) {

		printCeva("Masina");
		//printCeva(123);
		//printCeva('a');

		
		//System.out.println(123.00);
		
		//printGeneric("masina");
		printGeneric(123);
		//printGeneric('c');
		printGeneric(123.00);
		printGeneric(3000L);


		
	}
	
	

	public static <T extends Number> void printGeneric(T object) {
		System.out.println(object);
		System.out.println("Data type pentru obiect este : " + object.getClass().getName());
	}
	
	
	public static void printCeva(String text) {
		System.out.println(text);
	}
	
	
}
