package structural.decorator.topping;

import structural.decorator.pizza.Pizza;

public class ExtraCheese implements Toppings {

    private final Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + " w Extra Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 4.99D;
    }
}
