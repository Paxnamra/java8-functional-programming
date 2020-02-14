package jetBrains_academy;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class TernaryOperator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return condition != null ? String.valueOf(ifTrue.apply(T)) : ifFalse.apply(T);
    }

    public static void main(String[] args) {

        ternaryOperator(Objects::isNull, Object::toString, o -> "0").apply("Trolololo");
    }
}
