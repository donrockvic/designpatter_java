package com.headfirst.weatherapp;

import java.util.Observable;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float currentPressure = 29.92f;
    private float lastPressure;

    @Override
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void display() {

    }
}
