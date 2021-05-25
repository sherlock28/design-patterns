package factory;

public class ConnectionOracle implements IConnection{
    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    public ConnectionOracle() {
        this.host = "localhost";
        this.port = "1521";
        this.database = "testdb";
        this.username = "admin";
        this.password = "123";

    }

    @Override
    public void connect() {
        System.out.println("Connected to Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }
}
