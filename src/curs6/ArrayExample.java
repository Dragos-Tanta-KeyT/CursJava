package curs6;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[4];
	//	String[] textArray = {null, null, null, null}
	//  index :                 0     1     2     3
		System.out.println(textArray[0]);
		textArray[0] = "This ";
	//	String[] textArray = {This, null, null, null}
		System.out.println(textArray[0]);
		textArray[1] = "is ";
//		String[] textArray = {This, is, null, null}	
		textArray[2] = "an ";
		textArray[3] = "Array ";
//		String[] textArray = {This, is, an, Array}	
	
	System.out.println("-----------------------------------");
		
		for(int i = 0; i < textArray.length; i++) {
			
			System.out.print(textArray[i]);
		}
	
	System.out.println("\n-----------------------------------");

		/*
		 * while(textArray.hasNext() ){
		 * }
		 * 
		 */
		
	
		for(String element : textArray) {	
			
			System.out.print(element);
		}
	
	}

}
