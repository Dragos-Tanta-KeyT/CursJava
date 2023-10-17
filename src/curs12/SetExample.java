package curs12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("Pitesti");
		set.add("Ploiesti");
		set.add("Bucuresti");
		set.add("Constanta");
		set.add("Cluj");
		set.add("Brasov");

		System.out.println(set.size());

		System.out.println("---------------");
		set.add("Brasov");
		System.out.println(set.size());

		System.out.println(set);
		
		System.out.println("---------------");

		System.out.println(set.contains("Iasi"));
		
		System.out.println("---------------");

		for(String element : set) {
			System.out.println(element);
		}
		
		System.out.println("---------------");

		//set.equals(set)
		
		Iterator<String> iterator =  set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("---------------");

		set.remove("Brasov");
		System.out.println(set);
		set.clear();
		System.out.println(set);

	}

}
