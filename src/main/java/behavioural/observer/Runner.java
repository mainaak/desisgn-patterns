package behavioural.observer;

import behavioural.observer.observer.AggregatedCarMetrics;
import behavioural.observer.observer.InstantaneousMetrics;
import behavioural.observer.observer.Observer;
import behavioural.observer.subject.HondaECU;

public class Runner {

    public static void main(String[] args) {
        Observer<Double> instantaneousMetrics = new InstantaneousMetrics();
        Observer<Double> aggregatedMetrics = new AggregatedCarMetrics();
        HondaECU hondaECU = new HondaECU();
        hondaECU.registerObservers(instantaneousMetrics, aggregatedMetrics);
        hondaECU.setCarSpeed(20);
        hondaECU.setCarSpeed(30);
        hondaECU.setCarSpeed(40);
        hondaECU.setCarSpeed(30);
        hondaECU.setCarSpeed(20);
    }
}
