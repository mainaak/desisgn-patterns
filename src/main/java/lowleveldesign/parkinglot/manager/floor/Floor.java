package lowleveldesign.parkinglot.manager.floor;

import lowleveldesign.parkinglot.model.spot.FourWheelerParkingSpot;
import lowleveldesign.parkinglot.model.spot.ParkingSpot;
import lowleveldesign.parkinglot.model.spot.TwoWheelerParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    private final int floorNumber;
    private final List<ParkingSpot> parkingSpots;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void addParkingSpots(int twoWheelerSpots, int fourWheelerSpots) {
        for (int i = 1; i <= twoWheelerSpots; i++) parkingSpots.add(new TwoWheelerParkingSpot(i, this.floorNumber));
//        for (int i = 1; i <= fourWheelerSpots; i++) fourWheelerParkingSpots.add(new FourWheelerParkingSpot(i, this.floorNumber));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Floor floor = (Floor) o;

        return floorNumber == floor.floorNumber;
    }

    @Override
    public int hashCode() {
        return floorNumber;
    }
}
