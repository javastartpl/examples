package pl.javastart.exception.filenotfoundexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {

	public static void main(String[] args) {
		File file = new File("someRandomName.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bfReader = new BufferedReader(fileReader);
			bfReader.lines().forEach(System.out::println);
			bfReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("File does not exist");
		} catch (IOException e) {
			System.err.println("File exists, but there was IOException");
		}
	}

}
