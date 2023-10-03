package curs8;

public class TestWildAnimal {

	
	public static void main(String[] args) {
	/*	WildAnimal animal =  new WildAnimal();
		animal.makeSound();
		
		System.out.println("-------------------");
		
		Deer bambi =  new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("-------------------");
		Lion simba =  new Lion();
		simba.makeSound();
		simba.eatMeat(); */

		//WebDriver browser = new ChromeDriver();
		
		WildAnimal simba =  new Lion();
		simba.makeSound();
		((Lion) simba).eatMeat();
		feedAnimal(simba);
		
		simba = new Deer();
		simba.makeSound();
		((Deer) simba).eatGrass();
		feedAnimal(simba);

	}
	
	public static void feedAnimal(WildAnimal animal) {
		if (animal instanceof Lion) {
			System.out.println("You get burgers!");
		}else if(animal instanceof Deer) {
			System.out.println("You get salad!");
		}
		
	}

}
