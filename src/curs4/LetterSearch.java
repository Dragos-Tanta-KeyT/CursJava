package curs4;

import java.util.Scanner;

/*
 * Facem un program care cere un text de la tastatura
 * in text cautam litera a
 * daca o gasim printam ca am gasit litera si de cate ori aparea in text
 * daca nu o gasim printam ca nu am gasit
 * 
 */
public class LetterSearch {
	
	private String text;
	
	private void askTheUser() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter a text:");
		text =  scan.next().toUpperCase();
		scan.close();
	}
	
	public void letterSearch() {
		askTheUser();
		
		int counter =0;
		
		for(int i = 0; i <text.length(); i++) {
			
			if(text.charAt(i) == 'A') {
				counter++;
			}	
		}
		
		String result = counter == 0? "Letter A was not found":
			"Letter A was found " + counter + " times!";
		System.out.println(result);
	}

}
