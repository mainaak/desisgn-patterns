package creational.abstractfactory.continents.europe;

import creational.abstractfactory.Capital;

public class Berlin implements Capital {

    @Override
    public String getCurrency() {
        return "Euro";
    }
}
