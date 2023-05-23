package creational.singleton;

public class DBConnection {

    private String url;
    private int maxPoolSize;
    private int minIdle;

    private DBConnection() {
        System.out.println("Initialized DBConnection.");
    }
    private volatile static DBConnection dbConnection;

//    Draconian Synchronization
    synchronized public static DBConnection getSynchronizedInstance() {
        if (dbConnection == null) dbConnection = new DBConnection();
        return dbConnection;
    }

//    Double-Checked Locked Instance
    public static DBConnection getDoubleLockedInstance() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) dbConnection = new DBConnection();
            }
        }
        return dbConnection;
    }

//    Early Initialization
    private static final DBConnection earlyInitialized = new DBConnection();

    public static DBConnection getEarlyInitialized() {
        return earlyInitialized;
    }

//    Unchecked Lazy Intialization
    private static DBConnection lazyUncheckedInitalized;
    public static DBConnection getLazyUncheckedInstance() {
        if (lazyUncheckedInitalized == null) lazyUncheckedInitalized = new DBConnection();
        return lazyUncheckedInitalized;
    }
}
