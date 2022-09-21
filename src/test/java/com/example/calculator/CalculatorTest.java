package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    private Calculator calculator = new Calculator();
    @Test
    void testSum() {
        assertThat(calculator.sum(2, 3)).isEqualTo(5);
    }
}
