package other;

import java.util.stream.IntStream;

public class SumOfPrimes {
    public static void main(String[] args) {
        IntStream.iterate(0, i -> i + 1)
                .filter(SumOfPrimes::isPrime)
                .limit(20)
                .reduce((a, b) -> a + b)
                .ifPresent(sum -> System.out.println("Sum of first 20 primes: " + sum));
    }

    private static boolean isPrime(int n) {
        return IntStream.range(2, n)
                .noneMatch(i -> n % i == 0);
    }
}
