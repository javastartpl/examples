import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class NumbersOperationsAfter {
    public static void main(String[] args) {
        List<Integer> userNumbers = getNumbersFromUser();
        int positiveNumbersSum = getSum(userNumbers, x -> x >= 0);
        int negativeNumbersSum = getSum(userNumbers, x -> x < 0);
        printResults(positiveNumbersSum, negativeNumbersSum);
    }

    private static int getSum(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream()
                .filter(predicate)
                .mapToInt(Integer::intValue)
                .sum();
    }

    private static void printResults(int positiveNumbersSum, int negativeNumbersSum) {
        System.out.println("Suma wprowadzonych liczb dodatnich: " + positiveNumbersSum);
        System.out.println("Suma wprowadzonych liczb ujemnych: " + negativeNumbersSum);
    }

    private static List<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> userNumbers = new ArrayList<>();
        System.out.println("Ile liczb wczytać?");
        int numberOfNumbers = scanner.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Podaj kolejną liczbę:");
            userNumbers.add(scanner.nextInt());
        }
        return userNumbers;
    }
}