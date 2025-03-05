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

    // Set Values to null after completion
    @AfterMethod
    public void tearDown() {
        calc = null;
    }

    // Unit Test for Addition
    @Test
    public void testAddition() {
        Assert.assertEquals(calc.add(2, 3), 5);
    }
    // Unit Test for Subtraction
    @Test
    public void testSubtraction() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
    // Test Multiplication
    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(4, 3), 12);
    }
    // Test Division
    @Test
    public void testDivision() {
        Assert.assertEquals(calc.divide(10, 2), 5);
    }

    // Unit Test to test addition with zero
    public void testAdditionWithZero() {
        Assert.assertEquals(calc.add(0, 5), 5);
    }

}
