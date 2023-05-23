package creational.abstractfactory.interfaces;

import creational.abstractfactory.Capital;
import creational.abstractfactory.continents.asia.Beijing;
import creational.abstractfactory.continents.asia.NewDelhi;

public class AsiaFactory implements ContinentFactory {

    @Override
    public Capital getCapitalCity(String country) {
        if (country == null || country.isEmpty()) return null;
        switch (country) {
            case "india":
                return new NewDelhi();
            case "china":
                return new Beijing();
            default:
                throw new IllegalArgumentException("Not a valid country in this region");
        }
    }
}
