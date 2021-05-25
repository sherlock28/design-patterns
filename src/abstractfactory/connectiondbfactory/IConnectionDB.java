package abstractfactory.connectiondbfactory;

import factory.*;

public interface IConnectionDB {
    void connect();
    void disconnect();
}
