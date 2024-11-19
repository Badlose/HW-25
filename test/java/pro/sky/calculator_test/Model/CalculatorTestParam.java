package pro.sky.calculator_test.Model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.Integer.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class CalculatorTestParam {

    Calculator calculator = new Calculator();

    public static Stream<Arguments> providesParamForSumTests() {
        return Stream.of(
                of(10, 5, 15),
                of(5, 5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("providesParamForSumTests")
    public void shouldSummarize(Integer num1, Integer num2, Integer expected) {
        Integer result = valueOf(calculator.plus(num1, num2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> providesParamForDifferenceTests() {
        return Stream.of(
                of(10, 5, 5),
                of(50, 5, 45)
        );
    }

    @ParameterizedTest
    @MethodSource("providesParamForDifferenceTests")
    public void shouldDifference(Integer num1, Integer num2, Integer expected) {
        Integer result = valueOf(calculator.minus(num1, num2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> providesParamForMultiplyTests() {
        return Stream.of(
                of(10, 5, 50),
                of(8, 5, 40)
        );
    }

    @ParameterizedTest
    @MethodSource("providesParamForMultiplyTests")
    public void shouldMultiply(Integer num1, Integer num2, Integer expected) {
        Integer result = valueOf(calculator.multiply(num1, num2));
        assertEquals(expected, result);
    }

    public static Stream<Arguments> providesParamForDivideTests() {
        return Stream.of(
                of(10, 5, 2),
                of(50, 5, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("providesParamForDivideTests")
    public void shouldDivide(Integer num1, Integer num2, Integer expected) {
        Integer result = valueOf(calculator.divide(num1, num2));
        assertEquals(expected, result);
    }

}