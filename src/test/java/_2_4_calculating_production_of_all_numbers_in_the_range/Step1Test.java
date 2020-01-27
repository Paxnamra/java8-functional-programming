package _2_4_calculating_production_of_all_numbers_in_the_range;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

public class Step1Test {

    @Mock
    Step1 s1 = new Step1();

    @Test
    public void lambdaCalculate() {
        long result = Step1.longBi.applyAsLong(1, 4);
        Assert.assertEquals(24, result);
    }

    @Test
    public void multiplyCalculate() {
        long methodResult = s1.multiplyCalculate(Step1.longBi, 1, 4);
        Assert.assertEquals(24, methodResult);
    }
}
