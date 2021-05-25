package abstractfactory.connectiondbfactory;

public class ConnectionMySQL implements IConnectionDB {

    private String host;
    private String port;
    private String database;
    private String username;
    private String password;

    public ConnectionMySQL() {
        this.host = "localhost";
        this.port = "3306";
        this.database = "testdb";
        this.username = "root";
        this.password = "123";

    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }

}
