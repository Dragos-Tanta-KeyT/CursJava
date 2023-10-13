package curs11;

public class TestTextFileProcessor {

	public static void main(String[] args) {

		TextFileProcessor obj = new TextFileProcessor(); 
		obj.writeFile("Ana are mere\n");
		
		obj.readTextFile();
		
		obj.updateTxtFile("hostname=google gcp\n");
		obj.updateTxtFile("Nimic\n");

		obj.readTextFile();

	}

}
