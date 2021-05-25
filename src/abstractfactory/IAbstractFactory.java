package abstractfactory;

import abstractfactory.connectionrestfactory.IConnectionREST;
import abstractfactory.connectiondbfactory.IConnectionDB;

public interface IAbstractFactory {
    IConnectionDB getDB(String engine);
    IConnectionREST getREST(String area);
}
