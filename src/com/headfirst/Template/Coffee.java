package com.headfirst.Template;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addSediment() {
        System.out.println("Adding sugar and Milk");
    }
}
