
import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assert.assertEquals(calculator.add(3, 4), 7);
    }

    @Test
    public void testSubtraction() {
        Assert.assertEquals(calculator.subtract(10, 5), 5);
    }
}
