package pl.javastart.exception.classcastexception;

public class ClassCastExample {
	public static void main(String[] args) {
		Number[] numbers = {1, 2.5, 4, 7.6};
		double sum = 0;
		for (Number number : numbers) {
			sum += (Integer)number;
		}
		System.out.println(sum);
	}
}