package structural.decorator;

import structural.decorator.pizza.Margherita;
import structural.decorator.pizza.Pizza;
import structural.decorator.topping.ExtraCheese;
import structural.decorator.topping.Tomato;

public class Main {

    public static void main(String[] args) {
        Pizza margherita = new Margherita();
        Pizza tomato = new Tomato(margherita);
        Pizza extraCheese = new ExtraCheese(tomato);
        System.out.println(extraCheese.getName());
    }
}
