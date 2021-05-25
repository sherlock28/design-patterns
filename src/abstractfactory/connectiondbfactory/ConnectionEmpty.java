package abstractfactory.connectiondbfactory;

public class ConnectionEmpty implements IConnectionDB {

    @Override
    public void connect() {
        System.out.println("Connect error: No provider specified");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect error: No provider specified");
    }

}
