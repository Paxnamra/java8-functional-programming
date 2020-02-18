package _2_2_writing_simple_lambda_expressions;

import _2_2_writing_simple_lambda_expressions.extra.CustomIntBinaryOperator;

import java.util.function.IntBinaryOperator;

/**
 * Write a lambda expression that accepts two integers arguments and returns max of them.
 * Try not to use the Math library. Sample Input: 1 4 || Sample Output: 4
 */

public class Step1 {

    //shortest version
    public IntBinaryOperator solutionOne = Math::max;

    //one-liner with no return
    public IntBinaryOperator solutionTwo = (x, y) -> (x >= y) ? x : y;

    //version with return
    public IntBinaryOperator solutionThree = (x, y) -> {
        return (x >= y) ? x : y;
    };

    //with custom functional interface
    public CustomIntBinaryOperator cibo = (x, y) -> 0;
}
