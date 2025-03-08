package ciTests;

import org.testng.Assert;
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
    public void testMultiply(){
        Assert.assertEquals(calc.multiply(4,3),12); // Test simple Multiplication
    }

    @Test
    public void testDivision() {
        Assert.assertEquals(calc.divide(10, 2), 5); // Test simple division
    }

    @Test
    public void testLargeNumberAddition() {
        Assert.assertEquals(calc.add(1000000, 2000000), 3000000); // Test large number addition
    }

    @Test
    public void testNegativeAddition() {
        Assert.assertEquals(calc.add(-5, -3), -8); // Test adding negative numbers
    }

}
