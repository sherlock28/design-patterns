package abstractfactory.connectionrestfactory;

public class ConnectionRESTNoArea implements IConnectionREST {

    @Override
    public void readURL(String URL) {
        System.out.println("Unspecified area");
    }

}
