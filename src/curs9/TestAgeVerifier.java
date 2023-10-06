package curs9;

public class TestAgeVerifier {

	public static void main(String[] args) {

		int age = 5;
		
		AgeVerifier obj =  new AgeVerifier();
		try {
			obj.checkAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
