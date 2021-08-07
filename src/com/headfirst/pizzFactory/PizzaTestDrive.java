package com.headfirst.pizzFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Vicky ordered a "+ pizza.getName());
        System.out.println("-----------------------------------");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Mom ordered a "+pizza.getName());
    }
}
