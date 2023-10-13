package curs11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

	//write txt file
	public void writeFile(String text) {
		
		try(FileWriter obj = new FileWriter("test.txt") ){
			
			obj.write(text);

		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	
	//read txt file
	public void readTextFile() {
		
		try{
			File fileObj = new File("test.txt");
			Scanner scan = new Scanner(fileObj);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	//update txt file
	public void updateTxtFile(String text) {
		
		try(FileWriter obj = new FileWriter("test.txt", true) ){
			
			obj.append(text);

		}catch(IOException e) {
			e.printStackTrace();
		}	
		
		
	}
	
}
