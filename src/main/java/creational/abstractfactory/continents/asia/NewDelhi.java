package creational.abstractfactory.continents.asia;

import creational.abstractfactory.Capital;

public class NewDelhi implements Capital {
    @Override
    public String getCurrency() {
        return "Indian National Rupee (INR)";
    }
}
