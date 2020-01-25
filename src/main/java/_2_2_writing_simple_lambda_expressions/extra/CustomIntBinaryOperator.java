package _2_2_writing_simple_lambda_expressions.extra;

@FunctionalInterface
public interface CustomIntBinaryOperator {
    int intOp(int x, int y);

    default int printBiggerValue(int x, int y) {
        return (x >= y) ? x : y;
    }

    default int printBiggerAndMultiply(int x, int y) {
        final int multiplier = 2;
        int p = (x >= y) ? x : y;

        return p * multiplier;
    }
}

