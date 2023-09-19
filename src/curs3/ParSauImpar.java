package curs3;

import java.util.Scanner;

public class ParSauImpar {
	
	//variabila de instanta
/*	int number;
	
	public void askTheUser() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		//String nume;//variabila locala
	} 
	*/
	
	public int askTheUser() {
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		return number;
		//String nume;//variabila locala
	}
	
	
	public void checkNrIsOddOrEven() {
		
		if( askTheUser()  % 2 == 0) {	
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	} 
	

}
