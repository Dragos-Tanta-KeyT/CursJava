package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		Scanner scan2 = new Scanner(System.in);

		double nr = 0;
		try {
			
			nr = scan.nextDouble();
			scan.reset();
		}catch(Exception e) {
			System.out.println("Am intrat pe catch!");
			System.out.println("Please enter a new nr:");
			nr = scan2.nextDouble();
			
		}finally{
			scan.close();
			scan2.close();
		
		}
		
		System.out.println(nr);
		
	}

}
