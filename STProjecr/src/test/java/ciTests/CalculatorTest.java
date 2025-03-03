package ciTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.add(2, 3), 5);
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
}
