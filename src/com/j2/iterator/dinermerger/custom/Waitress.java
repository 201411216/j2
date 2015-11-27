package com.j2.iterator.dinermerger.custom;

public class Waitress {
    CustomMenu customMenu;
 
    public Waitress(CustomMenu customMenu) {
        this.customMenu = customMenu;
    }
    public void printMenu() {
        Iterator customIterator = customMenu.createIterator();
        System.out.println("\nLUNCH");
        printMenu(customIterator);
    }
    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}