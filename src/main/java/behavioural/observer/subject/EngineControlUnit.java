package behavioural.observer.subject;

import behavioural.observer.observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class EngineControlUnit<T> {

    protected List<Observer<T>> observers;

    public EngineControlUnit() {
        observers = new ArrayList<>();
    }

    @SafeVarargs
    public final void registerObservers(Observer<T>... observers) {
        this.observers.addAll(Arrays.asList(observers));
    }

    @SafeVarargs
    public final void removeObservers(Observer<T>... observers) {
        for (Observer<T> observer : observers) {
            this.observers.removeIf(observer::equals);
        }
    }

    @SafeVarargs
    final void notifyObservers(T... metrics) {
        observers.forEach(o -> o.doOnNotifyEvent(metrics));
    }

}
