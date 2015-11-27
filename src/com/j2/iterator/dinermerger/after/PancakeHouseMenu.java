package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("K&B's ������ ����", 
                "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("������ ����", 
                "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("��纣�� ������",
                "Pancakes made with fresh blueberries", true, 3.49);
        addItem("����",
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
