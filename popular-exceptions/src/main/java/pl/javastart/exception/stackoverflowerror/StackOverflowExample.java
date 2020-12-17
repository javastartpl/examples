package pl.javastart.exception.stackoverflowerror;

import java.util.stream.IntStream;

class StackOverflowExample {
    public static void main(String[] args) {
        int sum = sum(1_000_000);
        System.out.println(sum);
    }

    static int sum(int limit) {
        return IntStream.rangeClosed(1, limit).sum();
    }

//    static int sum(int limit) {
//        int sum = 0;
//        for (int i = 1; i <= limit; i++) {
//            sum += i;
//        }
//        return sum;
//    }

//    static int sum(int limit) {
//        return limit >= 1 ? limit + sum(limit - 1) : limit;
//    }
}
