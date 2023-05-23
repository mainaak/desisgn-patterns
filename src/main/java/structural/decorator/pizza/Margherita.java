package structural.decorator.pizza;

public class Margherita implements Pizza {

    @Override
    public String getName() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 99.99D;
    }
}
