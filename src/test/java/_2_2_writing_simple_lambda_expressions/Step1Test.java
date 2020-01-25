package _2_2_writing_simple_lambda_expressions;

import _2_2_writing_simple_lambda_expressions.extra.CustomIntBinaryOperator;
import org.junit.Assert;
import org.junit.Test;

public class Step1Test {

    private final CustomIntBinaryOperator cibo = (x, y) -> 0;

    @Test
    public void solutionOneTest() {
        int a = 4;
        int b = 8;

        int result = Step1.solutionOne.applyAsInt(a, b);
        Assert.assertEquals(8, result);
    }

    @Test
    public void solutionThreeTest() {
        int a = 5;
        int b = 7;

        int result = Step1.solutionThree.applyAsInt(a, b);
        Assert.assertEquals(7, result);
    }

    @Test
    public void solutionWithInterfaceTest() {
        int result = cibo.printBiggerValue(5, 4);
        Assert.assertEquals(5, result);
    }

    @Test
    public void checkIfInterfaceMethodMultiplies() {
        int result = cibo.printBiggerAndMultiply(5, 4);
        Assert.assertEquals(10, result);
    }
}
