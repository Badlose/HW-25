package pro.sky.calculator_test.Service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator_test.Model.Calculator;
import pro.sky.calculator_test.Service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private final Calculator calculator;

    public CalculatorServiceImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        return calculator.plus(num1, num2);
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        return calculator.minus(num1, num2);
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        return calculator.multiply(num1, num2);
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        return calculator.divide(num1, num2);
    }
}
