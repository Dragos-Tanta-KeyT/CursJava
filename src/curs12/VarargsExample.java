package curs12;

public class VarargsExample {
	
/*
 * 
 * JavascriptExecutor
 * executeScript("scriptul JS");
 * executeScript("scriptul JS", element);
 * executeScript("scriptul JS", element, element2);
 * executeScript("scriptul JS", element, element2 ...n);
 */	
	public static void main(String[] args) {

		printCeva("Unu");
		printCeva("Unu", "Doi");
		printCeva();
		printCeva("Unu", "Doi", "Trei");
	}
/*
	public static void printCeva(String a, String b) {
		System.out.println(a + b);

	}*/
	
	public static void printCeva(String...values) {
		
		for(String element : values) {
			System.out.println(element);
		}
	}
	
	
	public static void printAltceva(int nr, boolean ceva ,int...numbers) {
		
	}
	
}
