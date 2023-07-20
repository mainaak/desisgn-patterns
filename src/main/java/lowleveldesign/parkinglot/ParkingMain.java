package lowleveldesign.parkinglot;

import lowleveldesign.parkinglot.manager.ParkingLotManager;
import lowleveldesign.parkinglot.manager.floor.Floor;

public class ParkingMain {

    public static void main(String[] args) {

        ParkingLotManager parkingLotManager = ParkingLotManager.getInstance();
        parkingLotManager.addFloor(0);
        Floor floor = parkingLotManager.getFloor(0);
        floor.addParkingSpots(400, 600);

    }
}
