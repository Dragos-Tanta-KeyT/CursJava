package curs4;

public class LogicalExample {

	public static void main(String[] args) {

		// -->  && --AND     & --> AND
		// -- > || --OR      | --> OR
		/*
		 * && --> short circuit
		 * (x!=0) & (1/x>5)
		 * --> evalueaza (x!=0) si doar daca aceasta evalueaza pe TRUE
		 * va verifica si condita urmatoare (1/x>5)
		 * 
		 * & --> evalueaza (x!=0) si indiferent de rezultat va evalua si (1/x>5)
		 *
		 *	|| --> la fel ca si &&
		 *   | --> la fel ca si &
		 *
		 */
		
		int x  = 0;
		
		if(x!=0 & 1/x>5) {
			
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
	}

}
