import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    public void additionTestWithNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.addition(-3, 1));
    }

    @Test
    public void subtractionTest() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtraction(3, 2));
    }

    @Test
    public void subtractionTestWithNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(-4, calculator.subtraction(-2, 2));
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.division(6, 3));
    }

    @Test
    public void divisionTestWithZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.division(6, 0));
    }

    @Test
    public void divisionTestWithNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.division(-6, 3));
    }

    @Test
    public void multyplyTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    public void multyplyTestWithNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.multiply(3, -2));
    }

    @Test
    public void isEvenNumberTestTrue() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEvenNumber(2));
    }

    @Test
    public void isEvenNumberTestFalse() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isEvenNumber(3));
    }

    @Test
    public void isOddNumberTestTrue() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isOddNumber(3));
    }

    @Test
    public void isOddNumberTestFalse() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.isOddNumber(2));
    }

    @Test
    public void squareTest() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.square(3));
    }

    @Test
    public void squareTestWithNegativeNumber() {
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.square(-3));
    }
}
