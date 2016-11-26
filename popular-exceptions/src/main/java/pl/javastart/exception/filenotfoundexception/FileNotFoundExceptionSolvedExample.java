package pl.javastart.exception.filenotfoundexception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionSolvedExample {

	public static void main(String[] args) throws IOException {
		File file = new File("someRandomName.txt");
		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			BufferedReader bfReader = new BufferedReader(fileReader);
			bfReader.lines().forEach(System.out::println);
			bfReader.close();
		}
	}

}
