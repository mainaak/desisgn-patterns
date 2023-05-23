package creational.builder.builder;

import creational.builder.model.Vehicle;

public interface VehicleBuilder {
    VehicleBuilder maxGear(int maxGear);

    VehicleBuilder minGear(int minGear);

    Vehicle build();
}
