package curs4;

import java.util.Scanner;

/*
 * program care citeste de la tastatura 2 numere si verifica urmatoarele:
 * --> daca fiecare numar este pozitiv sau negativ
 * --> daca ambele numere sunt pozitive sau negative
 * --> care dintre numere este mai mare sau daca sunt egale
 * si printam corespunzator
 * 
 */
public class OperatorConditional {
	
	int num1, num2;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		num2 = scan.nextInt();
		scan.close();
	}

	
	public void verifiyTheNumbers() {
		askTheUser();
		//daca num1 este pozitiv sau negativ
		if(num1>0) {
			System.out.println("Num1 este pozitiv");
		}else {
			System.out.println("Num1 este negativ");
		}
		String result = (num1>0) ? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(result);
		//daca num2 este pozitiv sau negativ
		result = (num2>0) ? "Num2 este pozitiv" : "Num2 este negativ";
		System.out.println(result);
		//daca ambele nr sunt pozitive sau negative
		result = (num1>0 && num2>0)? "Ambele sunt pozitive" : "Ambele sunt negative";
		System.out.println(result);
		//care nr este mai mare (ar putea fi egale)
		result = (num1>num2)? "Num1 este mai mare":(num2>num1)?"Num2 este mai mare": "Numerele sunt egale";
		result = (num1>num2)? "Num1 este mai mare":(num2 == num1)?"Numerele sunt egale": "Num2 este mai mare";
		System.out.println(result);
		
		
	}
	
}
