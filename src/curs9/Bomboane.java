package curs9;

public class Bomboane extends Dulciuri{

	private double cantitate;
	
	public Bomboane(String nume, double pretVanzare, double cantitate) {
		setNume(nume);
		setPretVanzare(pretVanzare);
		this.cantitate =  cantitate;
	}
	
	@Override
	public double calculatePrice() {
		return getPretVanzare()*cantitate+19;
	}
	
}
