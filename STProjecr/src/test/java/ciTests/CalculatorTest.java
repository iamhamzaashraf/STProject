/*package ciTests;

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

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.subtract(5, 3), 2);

    }
}*/

package ciTests;

import org.testng.Assert;
import org.testng.annotations.*;
import calculator.Calculator;

public class CalculatorTest {

    private Calculator calc;

    @BeforeClass
    public void setupClass() {
        System.out.println("Starting CalculatorTest suite...");
    }

    @BeforeMethod
    public void setupMethod() {
        calc = new Calculator();
    }

    @AfterMethod
    public void teardownMethod() {
        System.out.println("Test completed.");
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int a, int b, int expected) {
        int result = calc.add(a, b);
        verifyResult(result, expected);
    }

    @DataProvider(name = "additionData")
    public Object[][] provideAdditionData() {
        return new Object[][]{
                {2, 3, 5},
                {10, 5, 15},
                {-1, 1, 0},
                {0, 0, 0}
        };
    }

    private void verifyResult(int actual, int expected) {
        Assert.assertEquals(actual, expected, "Result mismatch!");
    }
}
