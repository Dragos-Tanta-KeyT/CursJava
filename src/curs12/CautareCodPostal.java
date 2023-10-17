package curs12;
/*
 * Facem un program care ne returneaza un oras pe baza unui cod postal
 * intrebam userul codul postal
 * 
 * Avem codurile postale si orasele asociate inca de la initializare
 * Daca codul este valid atunci intoarcem : orasul asociat
 * Daca codul nu este valid, atunci aruncam CodPostalException
 * si intrebam din nou, pana primim un cod valid
 *
 */

import java.util.Scanner;

public class CautareCodPostal {

	public static void main(String[] args) {

		Scanner scan  =  new Scanner(System.in);
		CoduriPostale codPostal =  new CoduriPostale();
		
		do {
			System.out.println("Introdu un cod postal :");
			int cp = scan.nextInt();
			try {

				System.out.println("Orasul este : " + codPostal.cautaOras(cp));
				break;
				
			}catch(CodPostalException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
		}while(true);
		
	}

}
