import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperationsTest {

    @Test
    void testAddition() {
        Addition add = new Addition();
        assertEquals(8, add.operate(5, 3));
    }

    @Test
    void testSubtraction() {
        Subtraction sub = new Subtraction();
        assertEquals(2, sub.operate(5, 3));
    }

    @Test
    void testMultiplication() {
        Multiplication mul = new Multiplication();
        assertEquals(15, mul.operate(5, 3));
    }

    @Test
    void testPower() {
        Power pow = new Power();
        assertEquals(27, pow.operate(3, 3));
    }

    @Test
    void testSquareRoot() {
        SquareRoot sqrt = new SquareRoot();
        assertEquals(3, sqrt.operate(9, 0));
    }

    @Test
    void testDivision() {
        Division div = new Division();
        assertEquals(2, div.operate(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Division div = new Division();
        assertThrows(ArithmeticException.class, () -> div.operate(10, 0));
    }
}
