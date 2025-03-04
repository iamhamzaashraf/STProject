package ciTests;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

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
    public void testAddition() {
        Assert.assertEquals(calc.add(2, 3), 5);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
}
