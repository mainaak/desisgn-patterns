package lowleveldesign.urlshorterner.cache;

import lowleveldesign.urlshorterner.model.ShortenedRequest;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCache implements CacheStore {

    private static Map<ShortenedRequest, ShortenedRequest> DATASTORE;

    private InMemoryCache() {
        DATASTORE = new HashMap<>();
    }

    public static InMemoryCache getInstance() {
        return SINGLETON.inMemoryCache;
    }

    @Override
    public String getOriginalUrl(ShortenedRequest request) {
        return DATASTORE.get(request).getOriginalUrl();
    }

    @Override
    public void setShortenedUrl(ShortenedRequest request) {
        DATASTORE.put(request, request);
    }

    private final static class SINGLETON {
        private static final InMemoryCache inMemoryCache = new InMemoryCache();
    }
}
