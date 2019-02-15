package pl.javastart.exception.unsupportedoperationexception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UnsupportedExample1 {
    public static void main(String[] args) {
//        List<Integer> numbers= Arrays.asList(5, 10, 15, 20, 25, 30);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 25, 30));

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);

        System.out.println(numbers);
    }
}