package _2_26_collectors_product_of_squares;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 */

import static java.util.stream.Collectors.reducing;

public class Step1 {
    public static void main(String[] args) {

        List<Integer> collectorsNoZero = Stream.of(1, 2, 3, 4).collect(Collectors.toList());
        List<Integer> collectorsZero = Stream.of(0, 1, 2, 3).collect(Collectors.toList());

        long colZero = collectorsZero.stream().collect(reducing(1, i1 -> i1 * i1, (i1, i2) -> i1 * i2));
        long colVal = collectorsNoZero.stream().collect(reducing(1, i1 -> i1 * i1, (i1, i2) -> i1 * i2));
    }
}
