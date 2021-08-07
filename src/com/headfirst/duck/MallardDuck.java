package com.headfirst.duck;

public class MallardDuck extends Duck{
    MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard Duck");
    }
}
