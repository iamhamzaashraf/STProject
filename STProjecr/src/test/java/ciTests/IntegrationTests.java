package ciTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTests extends BaseTest {

    @Test
    public void testCombinedOperations() {
        int sum = calc.add(10, 5); // Add two numbers
        int result = calc.subtract(sum, 3); // Subtract from the sum
        Assert.assertEquals(result, 12); // Verify the result
    }

    @Test
    public void testSequentialOperations() {
        int result = calc.add(2, 2); // Add two numbers
        result = calc.add(result, 6); // Add more to the result
        result = calc.subtract(result, 3); // Subtract from the result
        Assert.assertEquals(result, 7); // Verify the final result
    }

    @Test
    public void testChainedMultiplicationAndDivision() {
        int product = calc.multiply(5, 4); // Multiply two numbers
        int result = calc.divide(product, 2); // Divide the product
        Assert.assertEquals(result, 10); // Verify the final result
    }

    @Test
    public void testComplexOperation() {
        int result = calc.add(calc.multiply(3, 4), calc.subtract(10, 5)); // Complex arithmetic
        Assert.assertEquals(result, 17); // Verify the result
    }

}