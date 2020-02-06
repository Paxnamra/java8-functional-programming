package _2_33_currying_functions;

import java.util.function.Function;

/**
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string following the rules:
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 * Sample Input 1: aa bb cc dd || Sample Output 1: aaCCbbDD
 */

public class Step2 {
    public static void main(String[] args) {

        Function<String, Function<String, Function<String, Function<String, String>>>> stringFunc = a -> b -> c -> d ->
                a.toLowerCase() +
                c.toUpperCase() +
                b.toLowerCase() +
                d.toUpperCase();

        Function<String, Function<String, Function<String, Function<String, String>>>> stringBuilder = a -> b -> c -> d ->
                new StringBuilder()
                .append(a.toLowerCase())
                .append(c.toUpperCase())
                .append(b.toLowerCase())
                .append(d.toUpperCase())
                .toString();

        System.out.println(stringFunc.apply("aa").apply("bb").apply("cc").apply("dd"));
        System.out.println(stringBuilder.apply("AAA").apply("bbb").apply("CCC").apply("ddd"));
    }
}
