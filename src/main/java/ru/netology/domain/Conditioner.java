package ru.netology.domain;

public class Conditioner {

    private String name;
    private int maxTemperature = 35;
    private int minTemperature = 15;
    private int currentTemperature = 25;
    private boolean on;

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        setCurrentTemperature(currentTemperature + 1);
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        setCurrentTemperature(currentTemperature - 1);

    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}