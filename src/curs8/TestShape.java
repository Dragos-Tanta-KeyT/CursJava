package curs8;

public class TestShape {

	public static void main(String[] args) {

		Shape shape =  new Shape();
		shape.draw();
		
		System.out.println("--------------------");
		
		Cerc cerc =  new Cerc();
		cerc.draw();
		
		System.out.println("--------------------");

		Patrat patrat =  new Patrat();
		patrat.draw();
	
	}

}
