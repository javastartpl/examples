package pl.javastart.exception.arithmeticexception;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
			int divide = x / y;
			System.out.println(divide);
		} catch(ArithmeticException e) {
			System.err.println("You can't divide by 0");
		}
	}

}
