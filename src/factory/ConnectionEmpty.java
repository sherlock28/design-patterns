package factory;

public class ConnectionEmpty implements IConnection {

    @Override
    public void connect() {
        System.out.println("Connect error: No provider specified");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnect error: No provider specified");
    }

}
