package lowleveldesign.parkinglot.model.ticket;

import lowleveldesign.parkinglot.model.spot.ParkingSpot;
import lowleveldesign.parkinglot.model.ticket.strategy.CostStrategy;
import lowleveldesign.parkinglot.model.vehicle.Vehicle;

public class Ticket {

    private static int idCounter = 0;
    private final int id;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final long entryTime;
    private final CostStrategy costStrategy;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, long entryTime, CostStrategy costStrategy) {
        this.id = idCounter++;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.costStrategy = costStrategy;
    }

    public double getCost() {
        return costStrategy.calculateCost(entryTime);
    }
}
