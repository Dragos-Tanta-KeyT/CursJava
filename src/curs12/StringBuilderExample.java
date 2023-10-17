package curs12;

public class StringBuilderExample {

	public static void main(String[] args) {

		reverseString("masina");
		deleteFromString("masina", 0, 2);
		
		
	}

	public static void reverseString(String text) {
		
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
		
	}
	
	public static void deleteFromString(String text, int startIndex, int endIndex) {
		StringBuilder sb =  new StringBuilder(text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);
	}
	
	
	

}
