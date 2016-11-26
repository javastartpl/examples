package pl.javastart.exception.numberformatexception;

import java.util.Scanner;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me some numer:");
		String text = sc.nextLine();
		int number = Integer.parseInt(text);
		System.out.println("Your number is: " + number);
		sc.close();
	}
}
