package curs5;

public class TestPassword {

	public static void main(String[] args) {

		PasswordValidator validator = new PasswordValidator();
		validator.getUsername();
		validator.printPasswordRules();
		//validator.getPassword();
		validator.validatePassword();
		
		
	}

}
