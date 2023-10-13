package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		String[] culori =  {"alb", "rosu", "galben", "verde", "mov", "negru"};
		
		List<String> list = new ArrayList<>(Arrays.asList(culori));
		System.out.println(list.size());
		list.add("portocaliu");
		System.out.println(list.size());

		System.out.println("----------------------");
		
		System.out.println(list.contains("gri"));
		System.out.println(list.contains("verde"));
		System.out.println("----------------------");

		for(String culoare : list) {
			System.out.println(list.indexOf(culoare) + " : " + culoare);	
		}
		
		//update element in list
		list.set(4, "visiniu");
		
		for(String culoare : list) {
			System.out.println(list.indexOf(culoare) + " : " + culoare);	
		}
		
		//
		list.subList(0, 3).clear();
		System.out.println(list);
		
		
		
	}

}
