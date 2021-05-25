package abstractfactory.connectionrestfactory;

import abstractfactory.IAbstractFactory;
import abstractfactory.connectiondbfactory.IConnectionDB;

public class ConnectionRESTFactory implements IAbstractFactory {

    @Override
    public IConnectionREST getREST(String area) {
        if (area == null) {
            return new ConnectionRESTNoArea();
        }
        if (area.equalsIgnoreCase("SALES")) {
            return new ConnectionRESTSales();
        }
        if (area.equalsIgnoreCase("PURCHASES")) {
            return new ConnectionsRESTPurchases();
        }
        return new ConnectionRESTNoArea();
    }

    @Override
    public IConnectionDB getDB(String engine) {
        return null;
    }

}
