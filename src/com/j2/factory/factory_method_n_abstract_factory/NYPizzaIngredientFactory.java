package com.j2.factory.factory_method_n_abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    public Potato createPotato(){
      return new MashedPotato();
    }
}
