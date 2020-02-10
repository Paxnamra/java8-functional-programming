package _2_35_custom_integer_reducer;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class Step1 {


    /**
     * The operator combines all values in the given range into one value
     * using combiner and initial value (seed)
     */
    public static final BiFunction<Integer, IntBinaryOperator, IntBinaryOperator> reduceIntOperator = i -> (a1, a2) -> (r1, r2) -> {
        int result = IntStream.rangeClosed(a1, a2).
    };

    /**
     * The operator calculates the sum in the given range (inclusively)
     */
    public static final IntBinaryOperator sumOperator = Integer::sum;

    /**
     * The operator calculates the product in the given range (inclusively)
     */
    public static final IntBinaryOperator productOperator = (i, j) -> {
        IntBinaryOperator binOp = Integer::sum;

//        IntStream intStr = IntStream.rangeClosed(i, j).
//        int result = IntStream.rangeClosed(i, j).

      return binOp.applyAsInt(i, j);
    };

    public static void main(String[] args) {

        reduceIntOperator.apply(0, productOperator).applyAsInt(6, 5);
        reduceIntOperator.apply(0, sumOperator).applyAsInt(6, 5);
    }
}
