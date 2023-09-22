package curs5;

import java.util.Scanner;

public class PasswordValidator {
	/*
	 * Scriem un program care valideaza o parola pe baza urmatorelor reguli:
	 * 1. parola trebuie sa aiba minim 10 caractere
	 * 2. parola trebuie sa contina cel putin un caracter upper case
	 * 3. parola nu trebuie sa fie la fel ca numele utilizatorului
	 * 
	 * Intrebam un user si o parola. Parola o validam dupa regulile de mai sus.
	 * Daca nu sunt respectate, printam, doar regulile care nu sunt respectate
	 * 
	 * Printam la inceput, regulile parolei
	 * Si la final, cand parola este validata, printam, "Parola valida!"
	 * 
	 * 1. intrebam user  X
	 * 2. intrebam parola X
	 * 3. validare reguli parola
	 * 4. printam regulile
	 * 5. validarea parola
	 * 
	 */
	
	String username, password;
	Scanner scan = new Scanner(System.in);
	boolean validare = true;

	public void printPasswordRules() {
		System.out.println("Reguli parola:");
		System.out.println("parola trebuie sa aiba minim 10 caractere");
		System.out.println("parola trebuie sa contina cel putin un caracter upper case");
		System.out.println("parola nu trebuie sa fie la fel ca numele utilizatorului");
	}
	
	public void getUsername() {
		System.out.println("Introdu username:");
		username = scan.next();
		
	}
	
	public String getPassword() {
		System.out.println("Introdu password:");
		password = scan.next();
		return password;

	}
	
	public void validatePasswordRules(String password) {
		validare =  true;
		
		if(password.length() <10) {			
			System.out.println("parola trebuie sa aiba minim 10 caractere");
			validare = false;
		}
		
		if(password.equals(username)) {
			System.out.println("parola nu trebuie sa fie la fel ca numele utilizatorului");
			validare = false;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("parola trebuie sa contina cel putin un caracter upper case");
			validare = false;
		}
		//return validare;
		
	}
	
	public void validatePassword() {
		
		do {
			
			validatePasswordRules(getPassword());
			//getPassword();
	
		}while(!validare);
		
	System.out.println("Parola valida!");
	}
	
}
