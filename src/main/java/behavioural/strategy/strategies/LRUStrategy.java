package behavioural.strategy.strategies;

import java.util.HashMap;
import java.util.Map;

public class LRUStrategy<T> implements CachingStrategy<T> {

    public final Map<String, T> DB;
    int id;

    public LRUStrategy() {
        DB = new HashMap<>();
        id = 1;
    }

    @Override
    public void store(T object) {
        DB.put("lru_" + id++, object);
        System.out.println("Stored in an LRU strategy");
    }
}
