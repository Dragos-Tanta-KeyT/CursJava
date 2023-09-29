package curs7;

public class TestShape {

	public static void main(String[] args) {

		Square obj = new Square("Galben", "Patrat");
		
		obj.printDetails();
		System.out.println(obj.culoare);
		System.out.println(obj.nume);
	}

}
