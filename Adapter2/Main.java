package Adapter2;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "1926");
			f.setValue("month", "8");
			f.setValue("day", "17");
			f.writeToFile("newFile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
