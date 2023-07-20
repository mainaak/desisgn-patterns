package lowleveldesign.parkinglot.manager.parkingstrategy;

import lowleveldesign.parkinglot.manager.floor.Floor;
import lowleveldesign.parkinglot.model.spot.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    ParkingSpot findParkingSpot(List<Floor> floors);

}
