package jetBrains_academy;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Create a supplier that return integer values from 0 to infinity.
 * After first get() invocation supplier must return 0. After second - 1, next - 2, 3 etc.
 * So this code should print "0 1 2 3 4 ":
 */

public class GetInfiniteRange {

    //AtomicInteger way
    public static Supplier<Integer> getInfiniteRange() {
        AtomicInteger val = new AtomicInteger();
        return val::getAndIncrement;
    }

    //iterator way
    public static Supplier<Integer> getInfiniteRangeIterator() {
        return IntStream.iterate(0, i -> i + 1).iterator()::next;
    }

    //increment by incrementing array index
    public static Supplier<Integer> getInfiniteRangeIncrementInsideArray() {
        final int[] i = {0};
        return () -> i[0]++;
    }

    public static void main(String[] args) {

        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();

        for (int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        Supplier<Integer> sup3 = getInfiniteRangeIncrementInsideArray();
        Supplier<Integer> sup4 = getInfiniteRangeIncrementInsideArray();

        for (int i = 0; i < 5; i++) {
            System.out.print(sup3.get() + " " + sup4.get() + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        Supplier<Integer> sup5 = getInfiniteRangeIterator();
        Supplier<Integer> sup6 = getInfiniteRangeIterator();

        for (int i = 0; i < 5; i++) {
            System.out.print(sup5.get() + " " + sup6.get() + " ");
        }
    }
}
