package com.j2.iterator.dinermerger.custom;

import java.util.*;

public class MenuTestDrive {
    public static void main(String args[]) {
        CustomMenu customMenu = new CustomMenu();
 
        Waitress waitress = new Waitress(customMenu);

        waitress.printMenu();
    }
}
