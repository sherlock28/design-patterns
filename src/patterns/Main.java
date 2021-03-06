package patterns;

/* Single Pattern */
//import singleton.Connection;

/* Factory Pattern */
//import factory.ConnectionFactory;
//import factory.IConnection;

/* Abstract Factory Pattern */
//import abstractfactory.AbstractFactory;
//import abstractfactory.IAbstractFactory;
//import abstractfactory.connectiondbfactory.IConnectionDB;
//import abstractfactory.connectionrestfactory.IConnectionREST;

/* Prototype Pattern */
//import prototype.AccountSaving;

/* Facade Pattern */
//import facade.CheckFacade;

public class Main {

    public static void main(String[] args) {
        /* Single Pattern */
//        Conexion c = Conexion.getInstance();
//        c.connect();
//        c.disconnect();


        /* Factory Pattern */
//        ConnectionFactory factory = new ConnectionFactory();
//
//        IConnection c1 = factory.getConnection("ORACLE");
//        c1.connect();
//        c1.disconnect();
//
//        IConnection c2 = factory.getConnection("MYSQL");
//        c2.connect();
//        c2.disconnect();
//
//        IConnection c3 = factory.getConnection("POSTGRESQL");
//        c3.connect();
//        c3.disconnect();
//        
//        IConnection c4 = factory.getConnection("hdj");
//        c4.connect();
//        c4.disconnect();
        /* Abstract Factory Pattern */
//        IAbstractFactory absFactorydb = AbstractFactory.getFactory("DB");
//        IConnectionDB cdb1 = absFactorydb.getDB("MYSQL");
//        cdb1.connect();
//        
//        IAbstractFactory absFactoryrest = AbstractFactory.getFactory("REST");
//        IConnectionREST crs1 = absFactoryrest.getREST("SALES");
//        crs1.readURL("https://rododev.vercel.app");
        /* Prototype Pattern */
//        AccountSaving accountSv = new AccountSaving();
//        accountSv.setAmount(200);
//        AccountSaving accountCloned = (AccountSaving) accountSv.cloneAccount();
//
//        if (accountCloned != null) {
//            System.out.println(accountCloned);
//        }
//
//        System.out.println(accountCloned == accountSv);


        /* Facade Pattern */
//        CheckFacade facade1 = new CheckFacade();
//        facade1.search("25/05/2021", "05/06/2021", "San Miguel de Tucum??n", "Buenos Aires");
//        
//        CheckFacade facade2 = new CheckFacade();
//        facade2.search("10/08/2021", "20/08/2021", "San Miguel de Tucum??n", "Rosario");

    }

}
