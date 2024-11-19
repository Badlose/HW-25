package pro.sky.calculator_test.Model;

import org.springframework.stereotype.Component;
import pro.sky.calculator_test.Exception.DivideByZeroException;

@Component
public class Calculator {

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести оба аргумента";
        }
        int result = num1 + num2;
        return Integer.toString(result);
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести оба аргумента";
        }
        int result = num1 - num2;
        return Integer.toString(result);
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести оба аргумента";
        }
        int result = num1 * num2;
        return Integer.toString(result);
    }

    public String divide(Integer num1, Integer num2) throws DivideByZeroException {
        if (num1 == null || num2 == null) {
            return "Необходимо ввести оба аргумента";
        }

        if (num2 == 0) {
            throw new DivideByZeroException("На 0 делить нельзя.");
        }

        int result = num1 / num2;
        return Integer.toString(result);
    }
}
