package curs4;
/*
 * Facem un calc simplu pentru operatiile de baza:
 *  + (adunare)
 *  - (scadere)
 *  * (inmultire)
 *  x (inmultire) --> x nu este operator de inmultire
 *  / (impartire)
 *  : (impartire) --> : nu este operator de impartire
 * Intrebam userul:
 * primul numar
 * operatia
 * Al doilea numar
 * Printam spre ex : 2 + 2 = 4!
 * 
 */

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class SimpleCalculator {
	
	/*
	 *  masina    masina.charAt(3) == i
	 *  012345
	 * 
	 */
	

	private int num1, num2, result;
	private char operatie;
	
	private void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter num1:");
		num1 = scan.nextInt();
		System.out.println("Please enter operation:");
		operatie = scan.next().charAt(0);
		System.out.println("Please enter num2:");
		num2 = scan.nextInt();
		scan.close();
	}
	
	public void calculator() {
		askTheUser();
		boolean flag =  true;
		
		if(operatie == '+') {
			result = num1 + num2;
			//System.out.println(num1 +" "+ operatie + " "+num2 + " = " + result);
		}else if(operatie == '-') {
			result = num1 - num2;
			//System.out.println(num1 +" "+ operatie + " "+num2 + " = " + result);
		}else if(operatie == '*' ||operatie == 'x' ) {
			result = num1 * num2;
		}else if(operatie == '/' ||operatie == ':' ) {
			result = num1 / num2;
		}else {
			System.out.println("Wrong operation!");
			flag = false;
		}
		
		if(flag) {
			System.out.println(num1 +" "+ operatie + " "+num2 + " = " + result);
		}
	}
	
}
