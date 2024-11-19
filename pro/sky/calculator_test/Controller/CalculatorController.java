package pro.sky.calculator_test.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator_test.Service.CalculatorService;
import pro.sky.calculator_test.Service.GreetingService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculationService;
    private final GreetingService greetingService;

    public CalculatorController(CalculatorService calculatorService, GreetingService greetingService) {
        this.calculationService = calculatorService;
        this.greetingService = greetingService;
    }

    @GetMapping
    public String hello() {
        return greetingService.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        return calculationService.divide(num1, num2);
    }
}