package com.j2.factory.factory_method_n_abstract_factory;

public class PotatoPizza extends Pizza{
  PizzaIngredientFactory ingredientFactory;
  public PotatoPizza(PizzaIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
  }
  void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        potato = ingredientFactory.createPotato();
  }
}