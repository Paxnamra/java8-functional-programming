package _2_33_currying_functions;

import java.util.function.IntFunction;

/**
 * Write a curried form of the function f(x, y, z) = x + y ∗ y + z ∗ z ∗ z
 * using lambda expressions in Java 8 style. The result and x, y, z must be integer numbers.
 */

public class Step1 {
    public static void main(String[] args) {

        IntFunction<IntFunction<IntFunction<Integer>>> tripleFunc = x -> y -> z -> x + y * y + z * z *z;

        System.out.println(tripleFunc.apply(1).apply(1).apply(1));
        System.out.println(tripleFunc.apply(2).apply(3).apply(4));
    }
}
