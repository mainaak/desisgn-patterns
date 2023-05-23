package creational.abstractfactory.interfaces;

import creational.abstractfactory.Capital;
import creational.abstractfactory.continents.europe.Berlin;
import creational.abstractfactory.continents.europe.London;

public class EuropeFactory implements ContinentFactory {

    @Override
    public Capital getCapitalCity(String country) {
        if (country == null || country.isEmpty()) return null;
        switch (country) {
            case "germany":
                return new Berlin();
            case "london":
                return new London();
            default:
                throw new IllegalArgumentException("This country does not exist in this region");
        }
    }
}
