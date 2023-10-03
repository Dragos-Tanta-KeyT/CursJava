package curs8;

public class TestProduct {

	public static void main(String[] args) {

		//Product produs =  new Product();
		
		Shoes pantof =  new Shoes(25, 33);
		System.out.println(pantof.calculcatePrice());
		pantof.ratingProduct();
		System.out.println("--------------------------");
		Tsihrt tricou = new Tsihrt(1, 2, 3);
		System.out.println(tricou.calculcatePrice());
		tricou.ratingProduct();
	}

}
