package facade;

public class CheckFacade {

    private ApiFlights apiflights;
    private ApiHotels apihotels;

    public CheckFacade() {
        apiflights = new ApiFlights();
        apihotels = new ApiHotels();
    }

    public void search(String initDate, String returnDate, String from, String to) {
        apiflights.searchFlights(initDate, returnDate, from, to);
        apihotels.searchHotels(initDate, returnDate, from, to);
    }
}
