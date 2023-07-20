package lowleveldesign.parkinglot.model.spot;

import lowleveldesign.parkinglot.model.vehicle.Vehicle;

public abstract class ParkingSpot {

    private final int id;
    private final int floor;
    private boolean isOccupied;
    private Vehicle vehicle;

    protected ParkingSpot(int id, int floor) {
        this.id = id;
        this.floor = floor;
        this.isOccupied = false;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
