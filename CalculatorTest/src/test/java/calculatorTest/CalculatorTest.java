package calculatorTest;

import calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void multiply() {
        double a = 2.5;
        double b = 6.4;
        assertEquals(16, Calculator.multiply(a,b));
    }

    @Test
    void divide() {
        double a = 2.5;
        double b = 6.4;
        assertEquals(0.390625, Calculator.divide(a,b));
    }

    @Test
    void divideByZero() {
        double a = 2.5;
        double b = 0;
        assertThrows(RuntimeException.class, () -> {Calculator.divide(a,b);});
    }

    @Test
    void sum() {
        double a = 2.5;
        double b = 6.4;
        assertEquals(8.9, Calculator.sum(a,b));
    }

    @Test
    void subtract() {
        double a = 2.5;
        double b = 6.4;
        assertEquals(-3.9, Calculator.subtract(a,b));
    }
}