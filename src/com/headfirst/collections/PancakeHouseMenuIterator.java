package com.headfirst.collections;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> menuItems;
    int position;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position<menuItems.size())
            return true;
        return false;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position = position +1;
        return menuItem;
    }
}

