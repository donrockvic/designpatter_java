package com.headfirst.Template;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addSediment() {
        System.out.println("Adding lemon");
    }

}
