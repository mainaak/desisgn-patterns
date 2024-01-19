package lowleveldesign.urlshorterner.model;

public class ShortenedRequest {

    private final String originalUrl;
    private String shortenedUrl;
    private final long creationTimestamp;
    private long expiryTimestamp;
    private String metadata;

    public ShortenedRequest(String originalUrl, long creationTimestamp) {
        this.originalUrl = originalUrl;
        this.creationTimestamp = creationTimestamp;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortenedUrl() {
        return shortenedUrl;
    }

    public void setShortenedUrl(String shortenedUrl) {
        this.shortenedUrl = shortenedUrl;
    }

    public long getCreationTimestamp() {
        return creationTimestamp;
    }

    public long getExpiryTimestamp() {
        return expiryTimestamp;
    }

    public void setExpiryTimestamp(long expiryTimestamp) {
        this.expiryTimestamp = expiryTimestamp;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortenedRequest that = (ShortenedRequest) o;

        return shortenedUrl != null ? shortenedUrl.equals(that.shortenedUrl) : that.shortenedUrl == null;
    }

    @Override
    public int hashCode() {
        return shortenedUrl != null ? shortenedUrl.hashCode() : 0;
    }
}
