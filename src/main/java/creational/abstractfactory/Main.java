package creational.abstractfactory;

import creational.abstractfactory.interfaces.ContinentFactory;

public class Main {

    public static void main(String[] args) {
        ContinentFactory continentFactory = ContinentFactory.getContinentFactory("asia");
        System.out.println(continentFactory.getClass());

        Capital capital = continentFactory.getCapitalCity("india");
        System.out.println(capital.getCurrency());
    }

}
