package curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put("T", "Tester");
		map.put("D", "Developer");
		map.put("M", "Manager");
		map.put("S", "Suport");
		
		System.out.println(map);
		map.put("T", "Automation");
		System.out.println(map);
		
		System.out.println(map.get("S"));
		System.out.println("-----------------------");
		
		System.out.println("contains key : " + map.containsKey("x"));
		System.out.println("contains value : " + map.containsValue("Manager"));

		System.out.println("-----------------------");

		for(String key : map.keySet()) {
			
			System.out.println(key);
		}
		
		System.out.println("-----------------------");

		for(String value : map.values()) {
			System.out.println(value);
		}
		
		System.out.println("-----------------------");

		map.remove("T");
		System.out.println(map);
		
		map.replace("D", "Director");
		System.out.println(map);
		map.put("S", "Secretara");
		System.out.println(map);
		map.replace("T", "Tester");
		System.out.println(map);


	}

}
