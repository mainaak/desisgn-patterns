package creational.abstractfactory.continents.asia;

import creational.abstractfactory.Capital;

public class Beijing implements Capital {

    @Override
    public String getCurrency() {
        return "Yuan";
    }
}
