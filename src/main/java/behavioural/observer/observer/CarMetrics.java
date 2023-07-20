package behavioural.observer.observer;

public abstract class CarMetrics implements Observer<Double> {

    protected double carSpeed;

    public abstract void updateCarSpeed(double carSpeed);

    @Override
    public final void doOnNotifyEvent(Double... metrics) {
        //   do exception handling
        updateCarSpeed(metrics[0]);
    }
}
