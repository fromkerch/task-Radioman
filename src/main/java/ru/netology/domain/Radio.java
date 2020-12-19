package ru.netology.domain;

public class Radio {
    private String name;
    private int currentRadiostation;
    private int volume;

    public void setCurrentRadiostation(int currentRadiostation) {
        if (currentRadiostation > 9) {
            return;
        }
        if (currentRadiostation < 0) {
            return;
        }
        this.currentRadiostation = currentRadiostation;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public void nextRadiostation() {
        if (currentRadiostation == 9) {
            setCurrentRadiostation(0);
            return;
        }
        setCurrentRadiostation(currentRadiostation + 1);
    }

    public void prevRadiostation() {
        if (currentRadiostation == 0) {
            setCurrentRadiostation(9);
            return;
        }
        setCurrentRadiostation(currentRadiostation - 1);
    }

    public void increaseVolume() {
        if (volume == 10) {
            return;
        }
        setVolume(volume + 1);
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        }
        setVolume(volume - 1);
    }

    public int getVolume() {
        return volume;
    }

    public int getCurrentRadiostation() {
        return currentRadiostation;
    }
}