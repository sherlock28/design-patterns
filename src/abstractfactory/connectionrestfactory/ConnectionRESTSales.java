package abstractfactory.connectionrestfactory;

public class ConnectionRESTSales implements IConnectionREST {

    @Override
    public void readURL(String URL) {
        System.out.println("Sales: " + URL);
    }

}
