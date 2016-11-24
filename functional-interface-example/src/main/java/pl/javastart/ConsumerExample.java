package pl.javastart;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kasia", "Ania", "Zosia", "Bartek");
		printList(names, str -> System.out.println(str));
	}

	public static void printList(List<String> list, Consumer<String> consumer) {
		for (String str : list) {
			consumer.accept(str);
		}
	}
}
