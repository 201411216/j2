package com.j2.factory.factory_method_n_abstract_factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Potato createPotato(){
      return new SlicedPotato();
    }
}