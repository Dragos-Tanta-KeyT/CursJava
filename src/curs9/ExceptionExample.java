package curs9;

public class ExceptionExample {

	public static void main(String[] args) {

		String[] days = {"L", "M", "Mi", "J", "V", "S", "D"};
	//	index /pozitie    0    1     2    3    4    5    6 
		
		try {
			System.out.println(days[8]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Nu mai accesa in afara array-ului!");
		}
		
		
		String nume = "Bob";
		System.out.println(nume.length());
	}

}
