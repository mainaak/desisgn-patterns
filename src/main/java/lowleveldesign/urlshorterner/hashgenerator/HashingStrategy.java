package lowleveldesign.urlshorterner.hashgenerator;

public interface HashingStrategy {

    String generateHash(String originalUrl);

}
