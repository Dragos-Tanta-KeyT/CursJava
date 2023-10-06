package curs9;

public class ExceptionExample3 {

	public static void main(String[] args) {

		try {
			
			String nume = null;
			System.out.println(nume.length());
			
		}catch(Exception e) {
			
			System.out.println("Error occured - Catch block");
			System.out.println(4/0);
			
		}finally {
			
			System.out.println("Finally block of code");
			
		}
		
		System.out.println("Code after try-catch-finally");
		
	}

}
