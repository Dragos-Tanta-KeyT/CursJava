package curs8;

public class Tsihrt extends Product {

	private int price;
	private int vat;
	private int adaos;
	
	public Tsihrt(int price, int vat, int adaos) {
		this.price = price;
		this.vat =  vat;
		this.adaos =  adaos;
		
	}
	
	@Override
	public int calculcatePrice() {
		return price + vat + adaos;
	}

}
