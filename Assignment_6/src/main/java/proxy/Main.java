package proxy;

public class Main {
    public static void main(String[] args) {
        Database database = new ProxyDatabase();
        try
        {
            database.connectTo("postgresql");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
