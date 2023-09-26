package curs6;

public class FindIndexOfElement {

	int[] numbers = {2, 4, 9, 8, 1, 12, 44, 55 };
	//numbers[0] == 2
	
	
	public static void main(String[] args) {
			FindIndexOfElement obj = new FindIndexOfElement();
			obj.rezolvareCuFor(8);
			obj.rezolvareCuForEach(8);
			obj.rezolvareCuWhile(8);

		
	}

	public void rezolvareCuFor(int nr) {
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] == nr ) {
				System.out.println("Index este " + i);
			}		
		}}

	public void rezolvareCuForEach(int nr) {
		int i = 0;
		for(int element : numbers) {
			
			if(element == nr) {
				System.out.println("Index este " + i) ;
			}
		 i++;
		}	
	}

	public void rezolvareCuWhile(int nr ) {
		int i = 0;	
		while(i < numbers.length) {
			
			if(numbers[i] == nr) {
				System.out.println("Index este " + i) ;
			}
			i++;
		}
		
		
	}
	

}
