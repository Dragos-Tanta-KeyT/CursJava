package curs7;

public class TestMostenire {

	public static void main(String[] args) {

		//Angajat --> Tester --> TesterAutomat
			
		TesterAutomat testerAutomat =  new TesterAutomat();
		
		testerAutomat.setProgrammingLanguage("Java"); // clasa TesterAutomat()
		testerAutomat.setSeniority("Junior"); //clasa Tester()
		testerAutomat.setDepartament("QA"); // clasa Tester()
		testerAutomat.setEmail("boc@boc.ro"); //clasa Angajat()
		testerAutomat.setNume("Boc"); //clasa Angajat()
		
	}

}
