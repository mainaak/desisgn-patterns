package creational.abstractfactory.interfaces;

import creational.abstractfactory.Capital;

public interface ContinentFactory {

    static ContinentFactory getContinentFactory(String continentName) {
        if (continentName == null || continentName.isEmpty()) return null;
        switch (continentName) {
            case "asia":
                return new AsiaFactory();
            case "europe":
                return new EuropeFactory();
            default:
                throw new IllegalArgumentException("Invalid continent name provided.");
        }
    }

    Capital getCapitalCity(String country);
}
