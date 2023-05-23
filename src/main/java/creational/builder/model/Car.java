package creational.builder.model;

import creational.builder.builder.CarBuilder;

public class Car implements Vehicle {

    private boolean isCarRunning;
    private int currentGear;
    private final int maxGear;
    private final int minGear;

    public Car(CarBuilder carBuilder) {
        this.maxGear = carBuilder.getMaxGear();
        this.minGear = carBuilder.getMinGear();
    }

    @Override
    public boolean start() {
        if (isCarRunning || currentGear != 0) return false;
        System.out.println("Starting car.");
        isCarRunning = true;
        return true;
    }

    @Override
    public boolean stop() {
        if (!isCarRunning) return false;
        System.out.println("Stopping car.");
        isCarRunning = false;
        currentGear = 0;
        return true;
    }

    @Override
    public boolean changeGear(int gear) {
        if (!isCarRunning || !isGearInRange(gear)) return false;
        System.out.println("Changing gear to " + gear);
        currentGear = gear;
        return true;
    }

    private boolean isGearInRange(int gear) {
        return gear <= maxGear && gear >= minGear;
    }
}
