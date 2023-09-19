package curs3;

import java.util.Scanner;

public class IfElseExample {

	/* Simulam un login
	 * daca credentialele sunt corecte printam login sucessfull
	 * daca nu sunt printam username sau parola sunt gresite
	 * User: Test
	 * Pass: 1234
	 * 
	 */
	
	public static void main(String[] args) {

		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please insert username:");
		String user = scan.next();
		System.out.println("Please insert password:");
		int pass = scan.nextInt();
		
		/* --> && AND  &
		 * --> || OR   |
		 */
		
		if((username.equals(user)) && (password == pass)) {
			
			System.out.println("Login sucesfull");
		}else {
			System.out.println("username or password is wrong");

		}
		
		scan.close();
		
		
	}

}
