package patterns;

import factory.ConnectionFactory;
import factory.IConnection;

import singleton.Connection;

public class Main {

    public static void main(String[] args) {
        /* Single Pattern */
//        Conexion c = Conexion.getInstance();
//        c.connect();
//        c.disconnect();


        /* Factory Pattern */
        ConnectionFactory factory = new ConnectionFactory();

        IConnection c1 = factory.getConnection("ORACLE");
        c1.connect();
        c1.disconnect();

        IConnection c2 = factory.getConnection("MYSQL");
        c2.connect();
        c2.disconnect();

        IConnection c3 = factory.getConnection("POSTGRESQL");
        c3.connect();
        c3.disconnect();
        
        IConnection c4 = factory.getConnection("hdj");
        c4.connect();
        c4.disconnect();

    }

}
