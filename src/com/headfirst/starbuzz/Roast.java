package com.headfirst.starbuzz;

public class Roast extends Beverage{

    public Roast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
