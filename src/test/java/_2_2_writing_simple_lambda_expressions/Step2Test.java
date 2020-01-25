package _2_2_writing_simple_lambda_expressions;

import org.junit.Assert;
import org.junit.Test;

public class Step2Test {

    @Test
    public void lFuncTest() {
        long a = 15;

        long result = Step2.lFunc.apply(a);
        Assert.assertEquals(16, result);
    }

    @Test
    public void lFunc2Test() {
        long a = 8;

        long result = Step2.lFunc2.apply(a);
        Assert.assertEquals(10, result);
    }
}
