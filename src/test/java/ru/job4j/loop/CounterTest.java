package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void whenStart0AndFinish5ThenSum15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart2AndFinish3ThenSum5() {
        int start = 2;
        int finish = 3;
        int expected = 5;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart7AndFinish1ThenSum0() {
        int start = 7;
        int finish = 1;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0AndFinish10ThenSumByEven30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart3AndFinish8ThenSumByEven18() {
        int start = 3;
        int finish = 8;
        int expected = 18;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart1AndFinish1ThenSumByEven0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2AndFinish14ThenSumByEven54() {
        int start = -2;
        int finish = 14;
        int expected = 54;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);

    }
}