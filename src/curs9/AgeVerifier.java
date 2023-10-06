package curs9;

public class AgeVerifier {
	
	public void checkAge(int age) throws InvalidAgeException {
		
		if(age <18) {
			throw new InvalidAgeException("Invalid age to proceed!");
			
		}else {
			System.out.println("you are allowed");
		}
	}
	
	

}
