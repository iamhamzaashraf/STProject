package ciTests;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntegrationTests {

    private Calculator calc;
Wha
    @BeforeMethod
    public void setUp() {
        calc = new Calculator();
    }

    @AfterMethod
    public void tearDown() {
        calc = null;
    }

    @Test
    public void testCombinedOperations() {
        int sum = calc.add(10, 5);
        int result = calc.subtract(sum, 3);
        Assert.assertEquals(result, 12);
    }

    @Test
    public void testSequentialOperations() {
        int result = calc.add(2, 2);
        result = calc.multiply(result, 3);
        result = calc.subtract(result, 3);
        Assert.assertEquals(result, 9);
    }
}
