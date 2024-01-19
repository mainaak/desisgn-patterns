package lowleveldesign.urlshorterner.hashgenerator;

import java.util.UUID;

public class UuidHashingStrategy implements HashingStrategy {

    @Override
    public String generateHash(String originalUrl) {
        return UUID.randomUUID().toString();
    }
}
