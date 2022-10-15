package proxy;

public class ProxyDatabase implements Database {
    private Database database = new RealDatabase();
    private final String databaseName = "postgresql";

    @Override
    public void connectTo(String dbName) throws Exception {

        if (!databaseName.equals(dbName.toLowerCase())){
            throw new Exception("Unable to connect to database " + dbName);
        }
        dbName = "localhost:8080/" + dbName;
        database.connectTo(dbName);
    }
}
