package lowleveldesign.parkinglot.manager.parkingstrategy;

import lowleveldesign.parkinglot.exception.ParkingNotFoundException;
import lowleveldesign.parkinglot.manager.floor.Floor;
import lowleveldesign.parkinglot.model.spot.ParkingSpot;

import java.util.List;

public class NearestFirstStrategy implements ParkingStrategy {

    @Override
    public ParkingSpot findParkingSpot(List<Floor> floors) {
        for (Floor floor : floors) {
            List<ParkingSpot> parkingSpots = floor.getParkingSpots();
            for (ParkingSpot parkingSpot : parkingSpots) {
                if (!parkingSpot.isOccupied()) return parkingSpot;
            }
        }
        throw new ParkingNotFoundException("Scanned all floors but parking was not found");
    }

}
