package _2_2_writing_simple_lambda_expressions;

import java.util.function.LongFunction;

/**
 * Write a lambda expression that accepts a long value and returns a next even number.
 * It is guaranteed an input number is non-negative. Solution format.
 * Submit your lambda expression in any valid format with ; on the end. Sample Input: 2 || Sample Output: 4
 */

public class Step2 {

    //oneliner
    public static LongFunction<Long> lFunc = (x) -> (x % 2 != 0) ? x + 1 : x + 2;

    //a bit more sophisticated
    public static LongFunction<Long> lFunc2 = (x) -> {
        if (x % 2 != 0) {
            return x + 1;
        } else {
            return x + 2;
        }
    };
}
