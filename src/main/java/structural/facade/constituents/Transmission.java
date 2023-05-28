package structural.facade.constituents;

public class Transmission {

    private int currentGear = -1;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "currentGear=" + currentGear +
                '}';
    }
}
