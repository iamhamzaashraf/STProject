package ciTests;

import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() { // Addition Test
        Calculator calc = new Calculator();
        int result = calc.add(2, 3); // Test case for "add" Method
        Assert.assertEquals(result, 5);
    }

    /*@Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.subtract(5, 3), 2);*/

    }
}
