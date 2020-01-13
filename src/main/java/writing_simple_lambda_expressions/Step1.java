package writing_simple_lambda_expressions;

import java.util.function.IntBinaryOperator;

public class Step1 {
    public static void main(String[] args) {

//        Write a lambda expression that accepts two integers arguments and returns max of them.
//        Try not to use the Math library. Sample Input: 1 4 || Sample Output: 4

        IntBinaryOperator solution1 = (x, y) -> {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        };

        System.out.println(solution1.applyAsInt(3,8));
    }
}
