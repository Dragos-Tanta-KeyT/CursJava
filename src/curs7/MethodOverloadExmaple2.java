package curs7;

public class MethodOverloadExmaple2 {


	public static void main(String[] args) {

		System.out.println(days(2));
		
	}

	public static String days(int day) {
		
		switch(day) {
			
		case 1:
			return "Luni";
		case 2:
			return "Marti";
		case 3 :
			return "Miercuri";
		case 4 :
			return "Joi";
		case 5 :
			return "Vineri";
		case 6 :
			return "Sambata";
		case 7 :
			return "Duminica";
		default:
			return "Nr invalid";
		
		}
	}
public static String days(String day) {
		
		switch(day) {
			
		case "L":
			return "Luni";
		case "M":
			return "Marti";
		case "Mi" :
			return "Miercuri";
		case "J" :
			return "Joi";
		case "V" :
			return "Vineri";
		case "S" :
			return "Sambata";
		case "D" :
			return "Duminica";
		default:
			return "Nr invalid";
		
		}
	}
	
	
}
