package factory;

public class ConnectionFactory {

    public IConnection getConnection(String engine) {
        if (engine == null) {
            return new ConnectionEmpty();
        }
        if (engine.equalsIgnoreCase("MySQL")) {
            return new ConnectionMySQL();
        }
        if (engine.equalsIgnoreCase("PostgreSQL")) {
            return new ConnectionPostgreSQL();
        }
        if (engine.equalsIgnoreCase("Oracle")) {
            return new ConnectionOracle();
        }
        return new ConnectionEmpty();
    }
}
