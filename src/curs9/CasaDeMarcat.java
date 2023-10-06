package curs9;
/*
 * Produse de tip dulciuri
 * Nume produs
 * Pret produs (pret + tva)
 * Stim ca unele produse se vad la bucata x
 * Stim ca unele produse se vand la kg (pret/0,4+tva) X
 * Stim ca unele produse se vand la bax
 * 
 * vreau sa printez :
 * Ai in total 3 produse
 * Costul total este de : cost total X produse
 * 
 */
public class CasaDeMarcat {
	int nrItem = 0;
	Dulciuri[] produseDulce =  new Dulciuri[3];
	//Bomboane rafaelo =  new Bomboane();
	
	public void enterItems(Dulciuri dulce) {
		produseDulce[nrItem] = dulce;
		nrItem++;
	}
	
	
	public double costTotal() {
		double total =0;
		
		for(Dulciuri dulce : produseDulce) {
			total = total+ dulce.calculatePrice();
		}
		return total;
	}

	
	public static void main(String[] args) {
		
		CasaDeMarcat casa = new CasaDeMarcat();
		
		casa.enterItems(new Bomboane("tictac", 2, 5));
		casa.enterItems(new Ciocolata("poiana", 4));
		casa.enterItems(new Napolitane("joe",45));

		
		System.out.println("Ai un total de " + casa.produseDulce.length + " produse!" );
		System.out.println("Ai de platit " + casa.costTotal() + " lei!");
		
		
	}
	
	
}
