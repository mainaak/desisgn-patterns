package behavioural.observer.observer;

public class InstantaneousMetrics extends CarMetrics {

    @Override
    public void updateCarSpeed(double carSpeed) {
        System.out.println("New car speed is " + carSpeed);
        super.carSpeed = carSpeed;
    }

}
