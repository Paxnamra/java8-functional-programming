package _2_2_writing_simple_lambda_expressions;

import org.junit.Assert;
import org.junit.Test;

public class Step1Test {

    private final Step1 s1 = new Step1();

    @Test
    public void should_return_bigger_value_from_solutionOne() {
        int a = 4;
        int b = 8;

        int result = s1.solutionOne.applyAsInt(a, b);
        Assert.assertEquals(8, result);
    }

    @Test
    public void should_return_bigger_value_from_solutionThree() {
        int a = 5;
        int b = 7;

        int result = s1.solutionThree.applyAsInt(a, b);
        Assert.assertEquals(7, result);
    }

    @Test
    public void should_return_bigger_value_from_interface_method() {
        int a = 5;
        int b = 4;

        int result = s1.cibo.printBiggerValue(a, b);
        Assert.assertEquals(5, result);
    }

    @Test
    public void should_return_bigger_value_multiplied_by_2_from_interface_method() {
        int a = 5;
        int b = 4;

        int result = s1.cibo.printBiggerAndMultiply(a, b);
        Assert.assertEquals(10, result);
    }
}
