package abstractfactory.connectiondbfactory;

import abstractfactory.IAbstractFactory;
import abstractfactory.connectionrestfactory.IConnectionREST;

public class ConnectionDBFactory implements IAbstractFactory {

    @Override
    public IConnectionDB getDB(String engine) {
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

    @Override
    public IConnectionREST getREST(String area) {
        return null;
    }
}
