package creational.builder.builder;

import creational.builder.model.Car;
import creational.builder.model.Vehicle;
import creational.builder.model.VehicleUtils;

public class CarBuilder extends VehicleUtils implements VehicleBuilder {

    @Override
    public VehicleBuilder maxGear(int maxGear) {
        super.maxGear = maxGear;
        return this;
    }

    @Override
    public VehicleBuilder minGear(int minGear) {
        super.minGear = minGear;
        return this;
    }

    @Override
    public Vehicle build() {
        return new Car(this);
    }
}
