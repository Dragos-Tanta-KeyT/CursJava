package curs12;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNamesInArray {

	public static void main(String[] args) {

		String[] names = {"Maria", "Oana","Ion","Maria", "Oana", "Ion", "Oana", "Maria", "Bogdan"};
		Set<String> set =  new HashSet<>();
		
		for(int i=0; i< names.length; i++) {
			//System.out.println("Primul for :" + names[i]);
			for(int j=i+1; j < names.length;j++) {
				//System.out.println("Al doilea for :" + names[j]);
				if(names[i].equals(names[j])) {
					//System.out.println("Nume duplicat " + names[i]);
					set.add(names[i]);
				}
			}
		}
		
		for(String nume : set) {
			System.out.println("Nume duplicat " + nume);
		}
		
	}

}
