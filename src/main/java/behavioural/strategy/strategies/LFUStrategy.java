package behavioural.strategy.strategies;

public class LFUStrategy<T> implements CachingStrategy<T> {

    @Override
    public void store(T object) {
        System.out.println("Stored in an LFU strategy");
    }
}
