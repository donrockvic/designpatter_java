package com.headfirst.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pankcake Brakfast",
                "Pancake with scramble eggs and toast",
                false,
                2.99);
        addItem("RegularPankcake Brakfast",
                "Pancake with fried eggs, sausage and toast",
                false,
                2.99);
        addItem("Blueberry Pankcake Brakfast",
                "Pancake with fresh blueberries",
                true,
                3.49);
        addItem("waffles",
                "waffles with your choice of blueberries and strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    public ArrayList<MenuItem> getMenuItems() {
        return (ArrayList<MenuItem>) menuItems;
    }
}
