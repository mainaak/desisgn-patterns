package lowleveldesign.parkinglot.model.vehicle;

public abstract class Vehicle {

    private final String registrationPlate;
    private final VehicleType vehicleType;

    protected Vehicle(String registrationPlate, VehicleType vehicleType) {
        this.registrationPlate = registrationPlate;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
