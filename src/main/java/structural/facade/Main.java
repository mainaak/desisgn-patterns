package structural.facade;

import structural.facade.facade.Car;

public class Main {


    public static void main(String[] args) {
        Car car = new Car();
        car.turnOnCar();
        System.out.println(car);
        car.turnOnNightMode();
        System.out.println(car);
        car = new Car();
        car.turnOnNightMode();
        System.out.println(car);
    }
}
