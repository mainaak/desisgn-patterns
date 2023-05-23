package behavioural.strategy.model;

import behavioural.strategy.strategies.CachingStrategy;

public class CachingOperations<T> {

    private CachingStrategy<T> cacheStorageStrategy;
    private final String cacheType;

    public CachingOperations(CachingStrategy<T> cachingStrategy, String cacheType) {
        this.cacheStorageStrategy = cachingStrategy;
        this.cacheType = cacheType;
    }

    public CachingStrategy<T> getCacheStorageStrategy() {
        return cacheStorageStrategy;
    }

    public void setCacheStorageStrategy(CachingStrategy<T> cacheStorageStrategy) {
        this.cacheStorageStrategy = cacheStorageStrategy;
    }

   public void store(T object) {
        this.cacheStorageStrategy.store(object);
   }

}
