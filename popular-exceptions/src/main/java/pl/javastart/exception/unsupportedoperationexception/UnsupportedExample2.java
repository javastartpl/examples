package pl.javastart.exception.unsupportedoperationexception;

import java.util.HashSet;
import java.util.Set;

class UnsupportedExample2 {
    public static void main(String[] args) {
//        Set<Integer> numbers = Set.of(5, 10, 15, 20, 25, 30);
        Set<Integer> numbers = new HashSet<>(Set.of(5, 10, 15, 20, 25, 30));

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);

        System.out.println(numbers);
    }
}