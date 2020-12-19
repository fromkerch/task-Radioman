package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldNextRadiostation() {
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        radio.nextRadiostation();
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    void shouldPrevRadiostation() {
        radio.prevRadiostation();
        radio.prevRadiostation();
        radio.prevRadiostation();
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    void shouldSelectingRadiostation() {
        radio.setCurrentRadiostation(7);
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    void shouldSelectingRadiostation1() {
        radio.setCurrentRadiostation(11);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    void shouldSelectingRadiostation2() {
        radio.setCurrentRadiostation(-1);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    void shouldIncreaseVolume() {
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

}
