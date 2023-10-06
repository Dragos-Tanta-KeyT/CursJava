package curs9;

// nume_metoda_care_face --> snake case
// camelCase 
// UpperCamelCase -->pt clase
// lowerCamelCase -->pt variabile, metode etc

public class Napolitane extends Dulciuri{

	public final double CANTITATE_BAX = 10;
	
	public Napolitane(String nume, double pretVanzare) {
		setNume(nume);
		setPretVanzare(pretVanzare);
	}
	
	@Override
	public double calculatePrice() {
		return getPretVanzare()*CANTITATE_BAX +19;
	}
	
	
}

