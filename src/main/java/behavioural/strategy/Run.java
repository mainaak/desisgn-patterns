package behavioural.strategy;

import behavioural.strategy.model.CachingOperations;
import behavioural.strategy.strategies.LFUStrategy;
import behavioural.strategy.strategies.LRUStrategy;

public class Run {
    public static void main(String[] args) {
        LRUStrategy<String> strategy = new LRUStrategy<>();
        CachingOperations<String> ops = new CachingOperations<>(strategy, "Redis");
        ops.store("A");
        ops.store("B");
        ops.setCacheStorageStrategy(new LFUStrategy<>());
        ops.store("C");
        ops.store("D");
        ops.setCacheStorageStrategy(strategy);
        ops.store("E");
        ops.store("F");
    }
}
