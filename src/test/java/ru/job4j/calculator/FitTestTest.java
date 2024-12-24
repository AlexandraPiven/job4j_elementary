package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class FitTestTest {

    @Test
    void whenMan180Then92() {
        short input = 180;
        double expected = 92;
        double output = FitTest.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69;
        double output = FitTest.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

}