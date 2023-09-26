package curs6;

import java.util.Scanner;

public class DIceGame {
/*
 * Facem un joc de zaruri care va avea urmatoarele reguli:
 * --> daca userul da in total : 2, 6, 12 --> Pierde jocul
 * --> daca userul da in total : 7, 11 --> castiga jocul
 * --> daca userul da in toatl : 3 si 10 --> repeta automat aruncarea
 * Daca da oricare alta varianta decat cele de mai sus, il intrebam daca mai vrea
 * sa joace.
 * Raspunsul trebuie sa fie un boolean true sau false
 * Pentru fiecare regula de mai sus, printam corespunzator
 *  
 */
	public static void main(String[] args) {
		int dice1 =0;
		int dice2 = 0; 
		int result = 0;
		boolean raspuns = true;
		
		// boolean flag =  true; -- > !flag 
		
		while(raspuns) {
			
			dice1 = (int) (Math.random()*6+1);	
			dice2 = (int) (Math.random()*6+1);
			
			result = dice1+dice2;			
			
			if(result == 2 || result == 6 || result == 12) {
				System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");
				break;
				//raspuns = false;
				
			}else if (result == 7 || result == 11) {
				System.out.println("Ai dat " + result + " Felicitari! AI castigat jocul!");
				break;
				//raspuns = false;
			}else if(result == 3 || result == 10) {
				System.out.println("Ai dat " + result + " Automat mai dai o data!");

			}else {
				System.out.println("Ai dat " + result);
				Scanner scan  =  new Scanner(System.in);
				System.out.println("Mai vrei sa joci ?");
				raspuns =  scan.nextBoolean();
			}
		
		}
		
		
		
/*	do {
		raspuns = false;
		
		dice1 = (int) (Math.random()*6+1);	
		dice2 = (int) (Math.random()*6+1);
		
		result = dice1+dice2;
		
		if(result == 2 || result == 6 || result == 12) {
			System.out.println("Ai dat " + result + " Imi pare rau! AI pierdut jocul!");
			
		}else if (result == 7 || result == 11) {
			System.out.println("Ai dat " + result + " Felicitari! AI castigat jocul!");

		}else if(result == 3 || result == 10) {
			System.out.println("Ai dat " + result + " Automat mai dai o data!");

		}else {
			System.out.println("Ai dat " + result);
			Scanner scan  =  new Scanner(System.in);
			System.out.println("Mai vrei sa joci ?");
			raspuns =  scan.nextBoolean();
		}
		
		
	}while(result == 3 || result ==10 || raspuns == true); */
		
		
		
	}

}
