package behavioural.observer.observer;

public class AggregatedCarMetrics extends CarMetrics {

    private double speedTotal;
    private int readings;
    private double maxSpeed;
    private double minSpeed;

    @Override
    public void updateCarSpeed(double carSpeed) {
        speedTotal += carSpeed;
        readings++;
        maxSpeed = Math.max(carSpeed, maxSpeed);
        minSpeed = Math.min(carSpeed, minSpeed);
        System.out.printf("Avg Speed: %f \t Min Speed: %f\t Max Speed: %f\n", speedTotal / readings, minSpeed, maxSpeed);
    }
}
