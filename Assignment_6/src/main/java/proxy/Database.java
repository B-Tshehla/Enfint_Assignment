package proxy;

public interface Database {
    void connectTo(String dbName) throws Exception;
}
