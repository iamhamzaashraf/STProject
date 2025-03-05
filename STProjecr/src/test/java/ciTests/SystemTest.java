package ciTests;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SystemTest {

    private Calculator calc;

    @BeforeMethod
    public void setUp() {
        calc = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testFullWorkflow() {
        int result = calc.add(5, 5);
        result = calc.multiply(result, 2);
        result = calc.divide(result, 5);
        Assert.assertEquals(result, 4);
    }
}
