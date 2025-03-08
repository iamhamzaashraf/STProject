package ciTests;

import calculator.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected Calculator calc; // Shared Calculator instance

    @BeforeMethod
    public void setUp() {
        calc = new Calculator(); // Initialize Calculator before each test
    }

    @AfterMethod
    public void tearDown() {
        calc = null; // Clean up after each test
    }
}
