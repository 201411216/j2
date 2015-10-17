package com.j2.factory;

public class PotatoPizza extends Pizza {
 public PotatoPizza() {
  name = "Potato Pizza";
  dough = "Cheese Crust";
  sauce = "Delicious Pizza Sauce";
  toppings.add("Fresh Mozzarella");
  toppings.add("Parmesan");
  toppings.add("Potato");
 }
}