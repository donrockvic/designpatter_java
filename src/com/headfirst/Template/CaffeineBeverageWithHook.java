package com.headfirst.Template;

import java.io.IOException;

abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() throws IOException {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addSediment();
        }
    }

    abstract void brew();

    abstract void addSediment();

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into Cup");
    }

    boolean customerWantsCondiments() throws IOException {
        return true;
    }
}
