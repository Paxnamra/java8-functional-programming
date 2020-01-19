package _2_6_writing_closures;

import java.util.function.DoubleFunction;

public class Step1 {
    public static void main(String[] args) {

//        Using closure write a lambda expression that calculates a * x ^ 2 + b * x + c  where a, b, c
//        are context final variables. They will be available in the context during testing. Note, the result is double.

        DoubleFunction<Double> dub = (d) -> {
            final double a = 3.5;
            final double b = 2.75;
            final double c = 0.2;
            return Math.pow(d, 2)  * a + (b * d) + c;
        };

        System.out.println(dub.apply(4.0));
        System.out.println(dub.apply(-2.25));
    }
}
