package com.headfirst.Template;

import java.io.IOException;

public class BeverageTestDrive {
    public static void main(String[] args) throws IOException {
        Tea tea = new Tea();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea");
        tea.prepareRecipe();

        System.out.println("\n Making coffee");
        coffeeWithHook.prepareRecipe();
    }
}
