package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FitnessTest {

    @Test
    void whenIvan90AndNik95ThenMonthEquals1() {
        int ivan = 90;
        int nik = 95;
        int expected = 1;
        int output = Fitness.calc(ivan, nik);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenIvan95AndNik90ThenMonthEquals0() {
        int ivan = 95;
        int nik = 90;
        int expected = 0;
        int output = Fitness.calc(ivan, nik);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenIvan50AndNik90ThenMonthEquals2() {
        int ivan = 50;
        int nik = 90;
        int expected = 2;
        int output = Fitness.calc(ivan, nik);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenIvan90AndNik90ThenMonthEquals1() {
        int ivan = 90;
        int nik = 90;
        int expected = 1;
        int output = Fitness.calc(ivan, nik);
        assertThat(output).isEqualTo(expected);
    }
}