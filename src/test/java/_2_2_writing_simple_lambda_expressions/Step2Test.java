package _2_2_writing_simple_lambda_expressions;

import org.junit.Assert;
import org.junit.Test;

public class Step2Test {

    private final Step2 s2 = new Step2();

    @Test
    public void should_add_1_to_odd_number_lFuncLine() {
        long a = 15;

        long result = s2.lFuncLine.apply(a);
        Assert.assertEquals(16, result);
    }

    @Test
    public void should_add_2_to_even_number_lFuncLine() {
        long a = 16;

        long result = s2.lFuncLine.apply(a);
        Assert.assertEquals(18, result);
    }

    @Test
    public void should_add_2_to_even_number_lFuncSophisticated() {
        long a = 8;

        long result = s2.lFuncSophisticated.apply(a);
        Assert.assertEquals(10, result);
    }

    @Test
    public void should_add_1_to_odd_number_lFuncSophisticated() {
        long a = 7;

        long result = s2.lFuncSophisticated.apply(a);
        Assert.assertEquals(8, result);
    }
}
