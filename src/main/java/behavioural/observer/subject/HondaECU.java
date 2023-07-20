package behavioural.observer.subject;

public class HondaECU extends EngineControlUnit<Double> {

    private double carSpeed;

    public void setCarSpeed(double carSpeed) {
        System.out.println("Setting car speed in ECU to " + carSpeed);
        this.carSpeed = carSpeed;
        super.notifyObservers(carSpeed);
    }
}
