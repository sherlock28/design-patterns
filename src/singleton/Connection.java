package singleton;

public class Connection {

    private static Connection instance;

    private Connection() {
    }
    
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
            return instance;
        }
        return instance;
    }

    public void connect() {
        System.out.println("DB is connected");
    }

    public void disconnect() {
        System.out.println("DB is disconnected");
    }
}
