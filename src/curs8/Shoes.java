package curs8;

public class Shoes extends Product{

	private int price;
	private int vat;
	
	public Shoes(int price, int vat) {
		this.price = price;
		this.vat =  vat;
	}
	
	@Override
	public int calculcatePrice() {
	
		return price + vat;
		
	}

}
