package ciTests;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void testAddition() {
        Assert.assertEquals(calc.add(2, 3), 5); // Test simple addition
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(5, 3), 2); // Test simple subtraction
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calc.divide(10, 2), 5); // Test simple division
    }

}
