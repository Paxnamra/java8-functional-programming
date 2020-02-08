package _2_17_check_if_prime_number;

import java.util.stream.LongStream;

/**
 * Write a method using Stream API to check the input number is prime or not.
 * Let's agree that input value is always greater than 1 (i.e. 2, 3, 4, 5, ....). Use the provided template for your method.
 */

public class Step1 {
    public static boolean isPrime(final long number) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(number)).allMatch(n -> number % n != 0);
    }

    public static void main(String[] args) {

        System.out.println("For any prime numbers it is true: ");
        System.out.println(isPrime(3));
        System.out.println(isPrime(7));
        System.out.println(isPrime(19));

        System.out.println();

        System.out.println("For others false: ");
        System.out.println(isPrime(12));
        System.out.println(isPrime(6));
        System.out.println(isPrime(24));
    }
}
