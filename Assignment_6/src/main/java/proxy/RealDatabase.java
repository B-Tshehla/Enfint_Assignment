package proxy;

public class RealDatabase implements Database{
    @Override
    public void connectTo(String dbName) throws Exception {
        System.out.println("Connected " + dbName);
    }
}
