package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();


    @Test
    void shouldStationQuantityPositive() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 1);
        assertEquals(1, radio.getStationsQuantity());
    }

    @Test
    void shouldStationQuantityNegative() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 31);
        assertEquals(10, radio.getStationsQuantity());
    }

    @Test
    void shouldStationQuantityNegative2() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 0);
        assertEquals(10, radio.getStationsQuantity());
    }


    @Test
    void shouldStationWithDefaultQuantityPositive() {
        radio.setStation(5);
        assertEquals(5, radio.getStation());
    }

    @Test
    void shouldStationWithDefaultQuantityNegative() {
        radio.setStation(11);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldStationWithDefaultQuantityNegative2() {
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }


    @Test
    void shouldStationWithCustomQuantityPositive() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 20);
        radio.setStation(15);
        assertEquals(15, radio.getStation());
    }

    @Test
    void shouldStationWithCustomQuantityNegative() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 20);
        radio.setStation(21);
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldStationWithCustomQuantityNegative2() {
        Radio radio = new Radio((int) 30);
        radio.setStationsQuantity((int) 20);
        radio.setStation(-1);
        assertEquals(0, radio.getStation());
    }


    @Test
    void shouldSwitchStationUpDefault() {
        Radio radio = new Radio("ThroughMax", 9);
        radio.switchStationUp();
        radio.switchStationUp();
        assertEquals(0, radio.getStation());
    }

    @Test
    void shouldSwitchStationDownDefault() {
        Radio radio = new Radio("ThroughMin", 1);
        radio.switchStationDown();
        radio.switchStationDown();
        assertEquals(10, radio.getStation());
    }



    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio(99);
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio(1);
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    void shouldSetVolumeNegative() {
        Radio radio = new Radio(101);
        assertEquals(10, radio.getVolume());
    }

    @Test
    void shouldSetVolumeNegative2() {
        Radio radio = new Radio(-1);
        assertEquals(10, radio.getVolume());
    }
}