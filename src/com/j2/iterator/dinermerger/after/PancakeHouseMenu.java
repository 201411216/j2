package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's 팬케익 조식", 
                "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("팬케익 조식", 
                "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("블루베리 팬케익",
                "Pancakes made with fresh blueberries", true, 3.49);
        addItem("와플",
                "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
    // other menu methods here
}
