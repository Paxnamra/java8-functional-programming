package _2_20_calculating_factorial;

import java.math.BigInteger;
import java.util.stream.LongStream;

/**
 * Many java developers wrote methods to calculate a factorial value using a recursive or iterative algorithm. It's time to do it with streams.
 * The factorial of n is calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is equal to 1.
 * Important. Use the given template for your factorial method. Pay attention to type of an argument and the returned value. Please, don't use cycles or recursion.
 */

public class Step1 {

    public static long factorial(long n) {
        BigInteger result = LongStream.iterate(1, v -> v + 1)
                .limit(n).mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        return result.longValue();
    }

    public static void main(String[] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(5));
    }
}
