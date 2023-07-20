package behavioural.observer.observer;

public interface Observer<T> {

    void doOnNotifyEvent(T ...metrics);

}
