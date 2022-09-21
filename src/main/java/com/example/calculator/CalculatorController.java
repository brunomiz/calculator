package com.example.calculator;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final Calculator calculator;

    @RequestMapping("sum")
    String sum(@RequestParam Integer a, @RequestParam Integer b) {
        return String.valueOf(calculator.sum(a, b));
    }
}
