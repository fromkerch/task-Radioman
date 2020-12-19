package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextRadiostation() {
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
    public void shouldPrevRadiostation() {
        radio.prevRadiostation();
        radio.prevRadiostation();
        radio.prevRadiostation();
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation() {
        radio.setCurrentRadiostation(7);
        assertEquals(7, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation1() {
        radio.setCurrentRadiostation(11);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldSelectingRadiostation2() {
        radio.setCurrentRadiostation(-1);
        assertEquals(0, radio.getCurrentRadiostation());
    }

    @Test
    public void shouldIncreaseVolume() {
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
    public void shouldDecreaseVolume() {
        radio.setVolume(2);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeOverMax() {
        radio.setVolume(11);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldVolumeOverMin() {
        radio.setVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldIncreaseMaxVolume() {
        radio.setVolume(10);
        radio.increaseVolume();

        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldDecreaseMinVolume() {
        radio.setVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }

}
