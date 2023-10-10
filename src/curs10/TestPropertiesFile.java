package curs10;

//CRUD operations
//Create
//Read
//Update
//Delete


public class TestPropertiesFile {

	public static void main(String[] args) {
		PropertiesFileProcessor obj =  new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("hostname");	
		obj.readPropertiesFile("email");	
		obj.updatePropertiesFile("hostname", "google cloud");
		obj.readPropertiesFile("hostname");	

	}

}
