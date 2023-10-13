package curs10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {

	//Write properties file
	public void writePropertiesFile() {
		
		try {
			OutputStream output = new FileOutputStream("test.properties");
			Properties propFile =  new Properties();
			propFile.setProperty("hostname", "amazon aws");
			propFile.setProperty("user", "testUser");
			propFile.setProperty("browser", "firefox");
			propFile.setProperty("email", "testUser@email.com");
			propFile.store(output, "am salvat fisierul!");
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//read properties file
	public void readPropertiesFile(String key) {
		
		try(InputStream input =  new FileInputStream("test.properties")){
				
			Properties propFile =  new Properties();
			propFile.load(input);
		
			System.out.println(propFile.getProperty(key));
					
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//update properties file
	public void updatePropertiesFile(String key, String value) {
		Properties propFile =  new Properties();

		try(InputStream input =  new FileInputStream("test.properties")){	
			propFile.load(input);					
		} catch (IOException e) {
			e.printStackTrace();
		}	
				
		try(OutputStream output = new FileOutputStream("test.properties")) {

			propFile.setProperty(key, value);
			propFile.store(output, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	//delete from file
	public void deleteFromPropertiesFile(String key) {
		Properties propFile =  new Properties();

		try(InputStream input =  new FileInputStream("test.properties")){	
			propFile.load(input);					
		} catch (IOException e) {
			e.printStackTrace();
		}	
				
		try(OutputStream output = new FileOutputStream("test.properties")) {

			propFile.remove(key);
			propFile.store(output, null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
}
