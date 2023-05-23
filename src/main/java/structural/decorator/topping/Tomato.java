package structural.decorator.topping;

import structural.decorator.pizza.Pizza;

public class Tomato implements Toppings {

    private final Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + " w Tomatoes";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 9.99D;
    }
}
