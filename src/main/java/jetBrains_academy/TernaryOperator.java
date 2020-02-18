package jetBrains_academy;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Let's combine function to build more complex functions using standard functional interfaces.
 * Given the predicate condition and two functions ifTrue and ifFalse.
 * Implement a method ternaryOperator which builds a new function returning the result of invoking ifTrue,
 * if the predicate is true and otherwise - the result of invoking ifFalse.
 */

public class TernaryOperator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return obj -> condition.test(obj) ? ifTrue.apply(obj) : ifFalse.apply(obj);
    }
}
