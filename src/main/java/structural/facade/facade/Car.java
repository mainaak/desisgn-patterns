package structural.facade.facade;

import structural.facade.constituents.Engine;
import structural.facade.constituents.Headlights;
import structural.facade.constituents.Transmission;

public class Car {

    private final Engine engine;
    private final Headlights headlights;
    private final Transmission transmission;

    public Car() {
        engine = new Engine();
        headlights = new Headlights();
        transmission = new Transmission();
    }

    public void turnOnCar() {
        engine.setOn(true);
        transmission.setCurrentGear(0);
    }

    public void turnOnNightMode() {
        headlights.setActivated(engine.isOn());
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", headlights=" + headlights +
                ", transmission=" + transmission +
                '}';
    }
}
