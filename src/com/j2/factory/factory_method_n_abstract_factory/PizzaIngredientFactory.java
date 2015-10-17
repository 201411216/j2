package com.j2.factory.factory_method_n_abstract_factory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Potato createPotato();
}
