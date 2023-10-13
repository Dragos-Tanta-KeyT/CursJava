package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		//verifica marimea listei
		System.out.println(list.size());
		//verifica daca lista este goala sau nu--> intoarce boolean
		System.out.println(list.isEmpty());
		//adauga elemente in lista
		list.add("Oana");
		list.add("Ion");
		System.out.println(list.size());
		list.add("Maria");
		list.add("Gabriel");
		System.out.println(list.size());
		
		for(String element:list) {
			System.out.println(element);
		}
		System.out.println("---------------------");
		//citesc element pe baza pozitiei (index)
		System.out.println(list.get(3));
		
		System.out.println("---------------------");
		System.out.println(list.indexOf("Maria"));
		System.out.println("---------------------");

		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		//
		list.add(0, "Ioana");
		System.out.println("---------------------");

		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		
		System.out.println(list);
		list.add("Oana");
		System.out.println(list);
		//pentru a sterge din lista
		list.remove(5);
		//list.remove("Oana");
		System.out.println("---------------------");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + " : "+ nume);
		}
		
		list.add(5, "Mihai");
		list.add(6, "Carmen");

		System.out.println(list.get(5));
		
		//stergem toata lista
		list.clear();
		
		System.out.println(list.size());
		
	}

}
