package facade;

public class ApiFlights {

    public void searchFlights(String initDate, String returnDate, String from, String to) {
        System.out.println("#################################");
        System.out.println("Flights found from " + from + " to " + to);
        System.out.println("Date leave " + initDate + " return data  " + returnDate);
    }
}
