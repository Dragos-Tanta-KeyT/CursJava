package curs5;

public class BreakContinue {

	public static void main(String[] args) {

		
		for(int i =0; i<10; i++) {
			
			if(i == 6) {
				//break;
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Exit");
		
	}

}
