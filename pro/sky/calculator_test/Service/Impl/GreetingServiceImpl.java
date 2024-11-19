package pro.sky.calculator_test.Service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator_test.Service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

    public String hello() {
        return "Добро пожаловать в калькулятор";
    }


}