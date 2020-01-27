package _2_4_calculating_production_of_all_numbers_in_the_range;

/**
 * Write a lambda expression that accepts two long arguments as a range borders and calculates (returns) production of all numbers in this range (inclusively).
 * It's guaranteed that 0 <= left border <= right border. if left border == right border then the result is any border.
 */

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class Step1 {
    public static LongBinaryOperator longBi = (a, b) -> LongStream.rangeClosed(a, b).reduce(1, (x, y) -> x * y);

    //for tests needed to extract it as method
    public long multiplyCalculate(LongBinaryOperator lobi, long startRange, long endRange) {
        return lobi.applyAsLong(startRange, endRange);
    }
}
