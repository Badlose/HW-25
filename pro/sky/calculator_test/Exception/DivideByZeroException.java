package pro.sky.calculator_test.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class DivideByZeroException extends IllegalArgumentException {

    public DivideByZeroException(String message) {
        super(message);
        System.out.println("На 0 делить нельзя.");
    }
}
