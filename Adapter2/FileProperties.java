package Adapter2;

import java.io.IOException;
import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
	Properties fio = new Properties();
	

	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream(filename);
		fio.load(in);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out = new FileOutputStream(filename);
		fio.store(out, "Written by fileproperties");

	}

	@Override
	public void setValue(String key, String value) {
		// TODO Auto-generated method stub
		fio.setProperty(key, value);

	}

	@Override
	public String getValue(String key) {
		// TODO Auto-generated method stub
		return fio.getProperty(key);
	}

}
