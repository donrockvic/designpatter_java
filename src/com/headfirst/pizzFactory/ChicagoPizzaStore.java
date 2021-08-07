package com.headfirst.pizzFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("Preparing Chicago style cheese pizza");
        }

        return pizza;
    }
}
