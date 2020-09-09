package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Conditioner conditioner = new Conditioner();

    @Test
    public void shouldIncreaseTemperaturePerDegree() {
        conditioner.increaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(26, actual);
    }

    @Test
    public void shouldDecreaseTemperaturePerDegree() {
        conditioner.decreaseCurrentTemperature();
        int actual = conditioner.getCurrentTemperature();
        assertEquals(24, actual);
    }

    @Test
    public void shouldIncreaseTemperatureToMax() {
        conditioner.increaseCurrentTemperature(); // 25~26
        conditioner.increaseCurrentTemperature(); // 26~27
        conditioner.increaseCurrentTemperature(); // 27~28
        conditioner.increaseCurrentTemperature(); // 28~29
        conditioner.increaseCurrentTemperature(); // 29~30
        conditioner.increaseCurrentTemperature(); // 30~31
        conditioner.increaseCurrentTemperature(); // 31~32
        conditioner.increaseCurrentTemperature(); // 32~33
        conditioner.increaseCurrentTemperature(); // 33~34
        conditioner.increaseCurrentTemperature(); // 34~35
        conditioner.increaseCurrentTemperature(); // 35~35

        int actual = conditioner.getCurrentTemperature();
        assertEquals(35, actual);
    }

    @Test
    public void shouldDecreaseTemperatureToMin() {
        conditioner.decreaseCurrentTemperature(); // 25~24
        conditioner.decreaseCurrentTemperature(); // 24~23
        conditioner.decreaseCurrentTemperature(); // 23~22
        conditioner.decreaseCurrentTemperature(); // 22~21
        conditioner.decreaseCurrentTemperature(); // 21~20
        conditioner.decreaseCurrentTemperature(); // 20~19
        conditioner.decreaseCurrentTemperature(); // 19~18
        conditioner.decreaseCurrentTemperature(); // 18~17
        conditioner.decreaseCurrentTemperature(); // 17~16
        conditioner.decreaseCurrentTemperature(); // 16~15
        conditioner.decreaseCurrentTemperature(); // 15~15

        int actual = conditioner.getCurrentTemperature();
        assertEquals(15, actual);
    }

    /* Негативные тесты */

    @Test
    public void shouldRetrieveCurrentDegree() {
        conditioner.setCurrentTemperature(36);
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldRetrieveCurrentDegree2() {
        conditioner.setCurrentTemperature(14);
        assertEquals(25, conditioner.getCurrentTemperature());
    }
}