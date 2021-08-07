package com.headfirst.collections;

import java.util.ArrayList;

public class testComponent {
    public void printMenu(){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItem = dinerMenu.getMenuItems();

        for(int i=0; i<breakfastItems.size(); i++){
            MenuItem menuItem = breakfastItems.get(i);
            System.out.print(menuItem.getName()+" ");
            System.out.print(menuItem.getPrice()+" ");
            System.out.print(menuItem.getDescription());
        }

        for(int i=0; i<lunchItem.length; i++){
            MenuItem menuItem = lunchItem[i];
            System.out.print(menuItem.getName()+" ");
            System.out.print(menuItem.getPrice()+" ");
            System.out.print(menuItem.getDescription());
        }


    }
}
