package curs9;

public class Dulciuri {

	private String nume;
	private double pretVanzare;
	
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public double getPretVanzare() {
		return pretVanzare;
	}
	public void setPretVanzare(double pretVanzare) {
		this.pretVanzare = pretVanzare;
	}
	
	public double calculatePrice() {
		return pretVanzare +19;
	}
	
	
	
	
}
