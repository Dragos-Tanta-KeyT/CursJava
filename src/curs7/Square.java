package curs7;

public class Square extends Shape{

	public Square(String culoare, String nume) {
		super(culoare, nume);
	}
	
	String nume = "Cerc";
	String culoare = "Negru";

	public void printDetails() {
		System.out.println("Numele formei este : "+ super.nume 
				+ " si culoarea este : " + super.culoare);
	}
	
	
}
