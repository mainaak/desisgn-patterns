package lowleveldesign.urlshorterner.cache;

import lowleveldesign.urlshorterner.model.ShortenedRequest;

public interface CacheStore {

    String getOriginalUrl(ShortenedRequest request);
    void setShortenedUrl(ShortenedRequest request);

}
