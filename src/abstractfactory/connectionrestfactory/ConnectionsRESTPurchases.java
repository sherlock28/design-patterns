package abstractfactory.connectionrestfactory;

public class ConnectionsRESTPurchases implements IConnectionREST {

    @Override
    public void readURL(String URL) {
        System.out.println("Purchases: " + URL);
    }

}
