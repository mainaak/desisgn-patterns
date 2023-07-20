package lowleveldesign.parkinglot.manager;

import lowleveldesign.parkinglot.manager.floor.Floor;
import lowleveldesign.parkinglot.manager.parkingstrategy.NearestFirstStrategy;
import lowleveldesign.parkinglot.manager.parkingstrategy.ParkingStrategy;
import lowleveldesign.parkinglot.model.spot.ParkingSpot;
import lowleveldesign.parkinglot.model.ticket.Ticket;
import lowleveldesign.parkinglot.model.ticket.strategy.HourlyCostingStrategy;
import lowleveldesign.parkinglot.model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotManager {

    private final List<Floor> floors;
    private ParkingStrategy parkingStrategy;
    private static volatile ParkingLotManager parkingLotManager;

    private ParkingLotManager() {
        parkingStrategy = new NearestFirstStrategy();
        this.floors = new ArrayList<>();
    }

    public static ParkingLotManager getInstance() {
        if (parkingLotManager == null) {
            synchronized (ParkingLotManager.class) {
                if (parkingLotManager == null) parkingLotManager = new ParkingLotManager();
            }
        }
        return parkingLotManager;
    }

    private ParkingSpot findParking() {
        return parkingStrategy.findParkingSpot(this.floors);
    }

    public Ticket issueTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParking();
        return new Ticket(vehicle, parkingSpot, System.currentTimeMillis(), new HourlyCostingStrategy());
    }

    public void addFloor(int floorNumber) {
        boolean present = floors.stream().anyMatch(f -> f.getFloorNumber() == floorNumber);
        if (present) return;
        Floor floor = new Floor(floorNumber);
        floors.add(floor);
    }

    public void removeFloor(Floor floor) {
        this.floors.remove(floor);
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Floor getFloor(int floorNumber) {
        for (Floor floor : floors) if (floor.getFloorNumber() == floorNumber) return floor;
        return null;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }
}
