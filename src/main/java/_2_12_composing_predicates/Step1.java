package _2_12_composing_predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/**
 * Write the disjunctAll method that accepts a list of IntPredicate's and returns a single IntPredicate. The result predicate is a disjunction of all input predicates.
 * If the input list is empty then the result predicate should return false for any integer value (always false).
 * Important. Pay attention to the provided method template. Do not change it.
 */

public class Step1 {

    /**
     * The method represents a disjunct operator for a list of predicates.
     * For an empty list it returns the always false predicate.
     */

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        IntPredicate res = null;

        if (!predicates.isEmpty()) {
            for (int i = 1; i < predicates.size(); i++) {
                res = predicates.get(0).or(predicates.get(i));
            }
        }
        return res;
    }

    public static IntPredicate disjunctAllShortened(List<IntPredicate> predicates) {
        IntPredicate res = predicates.get(0).or(predicates.get(1));
        return predicates.stream().reduce(res, IntPredicate::or);
    }

    public static void main(String[] args) {

        IntPredicate one = x -> x % 2 == 0;
        IntPredicate two = y -> y - 3 > 0;
        List<IntPredicate> predList = Arrays.asList(one, two);

        System.out.println(disjunctAll(predList).test(3));
        System.out.println(disjunctAllShortened(predList).test(5));

    }
}
