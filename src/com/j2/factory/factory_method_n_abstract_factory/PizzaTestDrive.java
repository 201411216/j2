package com.j2.factory.factory_method_n_abstract_factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore smStore = new SMPizzaStore();
 
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
 
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
        
        pizza = chicagoStore.orderPizza("potato");
        System.out.println("Kyle ordered a " + pizza + "\n");
        
        pizza = nyStore.orderPizza("potato");
        System.out.println("Alex ordered a " + pizza + "\n");
        
        pizza = smStore.orderPizza("cheese");
        System.out.println("David ordered a " + pizza + "\n");
    }
}