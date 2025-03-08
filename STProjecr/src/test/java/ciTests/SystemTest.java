package ciTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SystemTest extends BaseTest{

    @Test
    public void testFullWorkflow() {
        int result = calc.add(5, 5);
        result = calc.multiply(result, 2);
        result = calc.divide(result, 5);
        Assert.assertEquals(result, 4);
    }
}
