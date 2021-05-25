package factory;

public class ConnectionPostgreSQL implements IConnection {

    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    public ConnectionPostgreSQL() {
        this.host = "localhost";
        this.port = "5433";
        this.database = "testdb";
        this.username = "postgre";
        this.password = "123";

    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL");
    }
}
