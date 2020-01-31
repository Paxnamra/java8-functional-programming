package _2_3_too_many_arguments;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Write a lambda expression that accepts seven (!) string arguments and returns a string in upper case concatenated from all of them (in the order of arguments).
 * Note. The correct solution may not work in your local environment because you don't have suitable functional interface.
 * The testing system has the interface and can test your solution.
 */

public class Step1 {

    //both do the same
    public MultiStringFunction sumsWords = (String... s) -> Stream.of(s).map(String::toUpperCase).reduce("", String::concat);
    public MultiStringFunction sumsWordsToo = (String... s) -> Stream.of(s).map((String b) -> b.toUpperCase().replace(" ", "")).reduce("", String::concat);

    //experiment with ints
    public MultiIntFunction sumOfInts = (int... i) -> Arrays.stream(i).sum();

    //accepted solution
    public UglyStringFunction stringConcat = (x1, x2, x3, x4, x5, x6, x7) -> (x1 + x2 + x3 + x4 + x5 + x6 + x7).toUpperCase();
}
