package com.cg.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReadDemo {

	public static void main(String[] args) throws FileNotFoundException {
		char[] charArray = new char[200];
		try {
			FileReader reader = new FileReader("C:\\\\Users\\\\arjun\\\\OneDrive\\\\Desktop\\\\handling\\\\filename.txt");
			reader.read(charArray);
			System.out.println("Data present in the file: ");
			System.out.println(charArray);
			reader.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}