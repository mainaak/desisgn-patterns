package creational.abstractfactory.continents.europe;

import creational.abstractfactory.Capital;

public class London implements Capital {

    @Override
    public String getCurrency() {
        return "Great Britain Pound (GBP)";
    }
}
