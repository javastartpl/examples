package pl.javastart.exception.numberformatexception;

import java.util.Scanner;

public class NumberFormatExceptionSolvedExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me some numer:");
		String text = sc.nextLine();
		try {
			int number = Integer.parseInt(text);
			System.out.println("Your number is: " + number);
		} catch(NumberFormatException e) {
			System.err.println("This is not a number!");
		}
		sc.close();
	}
}
