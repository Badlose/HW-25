package pro.sky.calculator_test.Model;

import org.junit.jupiter.api.Test;
import pro.sky.calculator_test.Exception.DivideByZeroException;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator_test.Constants.CalculatorTestConstants.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(4, parseInt(calculator.plus(2, 2)));
    }

    @Test
    public void testSumArg() {
        assertEquals(WRONG_ARGUMENT_MESSAGE, calculator.plus(2, null));
    }

    @Test
    public void testDif() {
        assertEquals(4, parseInt(calculator.minus(6, 2)));
    }

    @Test
    public void testDifArg() {
        assertEquals(WRONG_ARGUMENT_MESSAGE, calculator.minus(null, 2));

    }

    @Test
    public void testMultiply() {
        assertEquals(20, parseInt(calculator.multiply(10, 2)));
    }

    @Test
    public void testMultiplyArg() {
        assertEquals(WRONG_ARGUMENT_MESSAGE, calculator.multiply(2, null));
    }
    @Test
    public void testDivide() {
        assertEquals(20, parseInt(calculator.divide(80, 4)));
    }

    @Test
    public void testDivideArg() {
        assertEquals(WRONG_ARGUMENT_MESSAGE, calculator.multiply(null, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(DivideByZeroException.class, () -> calculator.divide(10, 0));
    }



}
