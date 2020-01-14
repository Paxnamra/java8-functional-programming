package _2_2_writing_simple_lambda_expressions;

import java.util.function.LongFunction;

public class Step2 {
    public static void main(String[] args) {

//        Write a lambda expression that accepts a long value and returns a next even number.
//        It is guaranteed an input number is non-negative. Solution format.
//        Submit your lambda expression in any valid format with ; on the end. Sample Input: 2 || Sample Output: 4

        LongFunction<Long> bin = (x) -> {
            if (x % 2 != 0) {
                return x + 1;
            } else {
                long y = x + 2;
                return y;
            }
        };

        System.out.println(bin.apply(3));
    }
}
