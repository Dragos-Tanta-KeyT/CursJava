package curs4;

import java.util.Scanner;

public class Palindrom {

	private String text;
	
	private void askTheUser() {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Please enter a text:");
		text =  scan.next().toUpperCase();
		scan.close();
	}
	//         01234
	//cuvant = radar  --> radar.lenght() == 5
	//cuvantIntors = ""
	//cuvantIntors = cuvant.charAt(4)
	//cuvantIntors = "r"
	//cuvantIntors = "r" + cuvant.charAt(3)
	//cuvantIntors = "ra"
	//cuvantIntors = "ra" + cuvant.charAt(3)
	
	public void checkWordIsPalindrom() {
		askTheUser();
		String cuvantIntors = "";
		
		for(int i=text.length()-1 ; i>=0 ;i--) {
			
			cuvantIntors = cuvantIntors + text.charAt(i);	
		}
		
		String result = text.equals(cuvantIntors)?"Este palindrom":"Nu este palindrom";
		System.out.println(result);
		
	}

	
	
	
}
