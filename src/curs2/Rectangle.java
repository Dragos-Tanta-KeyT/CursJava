package curs2;

public class Rectangle {

	public static void main(String[] args) {

		//room1
		int lenght = 3;
		int width = 6;
		System.out.println("Aria camerei este :" + lenght *width);
		
		//room2
		int lenght2 = 4;
		int width2 = 4;
		System.out.println("Aria camerei este :" + lenght2 *width2);

		Rectangle casa = new Rectangle();
		
		Rectangle hol =  new Rectangle();
		System.out.println("Aria camerei este :" + hol.aria(2, 2));
		int arieHol = hol.aria(2, 2);
		Rectangle baie =  new Rectangle();
		System.out.println("Aria camerei este :" + baie.aria(4, 2));
		int arieBaie = baie.aria(4, 2);
		Rectangle dormitor =  new Rectangle();
		int arieDormitor = dormitor.aria(4, 4);

		System.out.println("Aria totala este : " 
		+ casa.ariaTotala(arieHol, arieBaie, arieDormitor) );
		
	}
	
	public int aria(int lenght , int width) {
		return lenght * width;
	}
	
	public int ariaTotala(int baie, int hol, int dormitor) {
		return baie + hol + dormitor;
	}
	
	//varargs--> 
	// obiect.ariaTotalaFolosindVarargs(baie, hol);
	// obiect.ariaTotalaFolosindVarargs(baie, hol, dormitor, sufra);
	// camere = {baie, hol, dormitor, sufra}
	public int ariaTotalaFolosindVarargs(int...camere) {
		
		int sum = 0;
		for(int room : camere) {
			sum += room;
			//sum = sum +room;
		}
		return sum;
	}
	
}
