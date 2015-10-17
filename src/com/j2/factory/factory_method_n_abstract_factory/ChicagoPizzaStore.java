package com.j2.factory.factory_method_n_abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if(item.equals("potato")){
          pizza = new PotatoPizza(ingredientFactory);
          pizza.setName("Chicago Style Potato Pizza");
        }
        return pizza;
    }
}
