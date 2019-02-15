package pl.javastart.exception.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ConcurrentExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 10, 15, 20, 25, 30, 35, 40));

//        Błąd
//        for (Integer number : numbers) {
//            if(number % 10 == 0)
//                numbers.remove(number);
//        }

//        OK
//        for (Iterator<Integer> it = numbers.iterator(); it.hasNext();) {
//            Integer next = it.next();
//            if(next % 10 == 0)
//                it.remove();
//        }

//        Java 8+
        numbers.removeIf(e -> e % 10 == 0);
    }
}