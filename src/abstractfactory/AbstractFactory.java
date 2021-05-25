package abstractfactory;

import abstractfactory.connectiondbfactory.ConnectionDBFactory;
import abstractfactory.connectionrestfactory.ConnectionRESTFactory;

public class AbstractFactory {
    
    public static IAbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("DB")) {
            return new ConnectionDBFactory();
        }
        if (factory.equalsIgnoreCase("REST")) {
            return new ConnectionRESTFactory();
        }
        return null;
    }
}
