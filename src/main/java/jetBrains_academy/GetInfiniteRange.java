package jetBrains_academy;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Create a supplier that return integer values from 0 to infinity.
 * After first get() invocation supplier must return 0. After second - 1, next - 2, 3 etc.
 * So this code should print "0 1 2 3 4 ":
 */

public class GetInfiniteRange {

    public static Supplier<Integer> getInfiniteRange() {

        AtomicInteger createZero = new AtomicInteger();
        IntSupplier is = () -> 0;
        Supplier<Integer> in = () -> IntStream.generate();
        return in;
    }

    public static void main(String[] args) {

        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();

        for(int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }
}
