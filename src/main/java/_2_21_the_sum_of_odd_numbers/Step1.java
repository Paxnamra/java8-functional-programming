package _2_21_the_sum_of_odd_numbers;

import java.util.stream.LongStream;

/**
 * Write a method for calculating the sum of odd numbers in the given interval (inclusively) using Stream API.
 * Important. Use the provided template for your method. Pay attention to type of an argument and the returned value. Please, don't use cycles.
 * Sample Input: 7 9 || Sample Output: 16 ||  Sample Input 2: 21 30 || Sample Output 2: 125
 */

public class Step1 {
    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(n -> n % 2 != 0).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfOddNumbersInRange(7, 9));
        System.out.println(sumOfOddNumbersInRange(21, 30));
    }
}
