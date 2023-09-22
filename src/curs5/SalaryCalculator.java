package curs5;

import java.util.Scanner;

public class SalaryCalculator {

	/*Facem un program care calculeaza salariul pe o saptamna
	 * Intrebam utilizatorul cate ore a lucrat
	 * nu permitem overtime (max ore =40)
	 * nu permitem nici ore negative sau 0 (min ore = 1)
	 * daca introduce nr invalid de ore, printam si il rugam sa introduca din nou
	 * facem asta pana introduce nr valid de ore
	 * daca nr este valid, calculam nrOre * 25
	 * 
	 */
	
	
	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter the working hours:");
/*		int oreLucrate = scan.nextInt();
		
		while(oreLucrate >40 || oreLucrate <1) {
			
			System.out.println("Nr invalid de ore");
			System.out.println("Introdu un numar intre 1 si 40:");
			oreLucrate = scan.nextInt();
		}
		
		System.out.println("Salariul tau este :" +oreLucrate*25); */
		int oreLucrate;
		for(oreLucrate = scan.nextInt();oreLucrate >40 || oreLucrate <1;oreLucrate = scan.nextInt()) {
			
			System.out.println("Nr invalid de ore");
			System.out.println("Introdu un numar intre 1 si 40:");
		}
		System.out.println("Salariul tau este :" +oreLucrate*25);
	}

}
