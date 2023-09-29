package curs7;

import java.util.Random;

/*
 * facem un program care genereaza 6 numere intre 0-9
 * numerele le tine intr-un array
 * nu tine numere duplicate
 * printeaza array-ul
 * 
 * 
 * o metoda care genereaza nr si le pune in array
 * o metoda care verifica duplicate
 * o metoda care printeaza array-ul
 */


public class RandomNumberGenerator {

	final int LENGHT = 6;
	final int MAX_NUMBER = 9;
	
	public int[] generateNumbers() {
		
		int[] numbers =  new int[LENGHT];
		Random random  = new Random();
		
		for(int i = 0; i < LENGHT; i++) {
			
			int randomNr = random.nextInt(MAX_NUMBER);
			
			while(checkDuplicateNumbers(numbers, randomNr)) {
				
				randomNr = random.nextInt(MAX_NUMBER);
			}		
			numbers[i] =  randomNr;
		}
	
		return numbers;
	}
	
	public boolean checkDuplicateNumbers(int[] array,  int nr) {
		
		for(int number : array) {
			
			if(number == nr) {
				return true;
			}
		}
		return false;
	}
	
	public void printArray(int[] array) {
		
		for(int nr : array) {
			System.out.print( nr + " | ");
			
		}
		
	}
	
	
}
