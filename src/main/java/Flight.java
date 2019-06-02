import java.util.ArrayList;

public class Flight {


    private Plane plane;
    private int flightNumber;
    private  String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList< Passenger> passenger;
    private PlaneType planeType;



    public Flight(int flightNumber, String destination, String departureAirport, String departureTime, PlaneType planeType) {
        this.passenger = new  ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.planeType = planeType;
    }

    public int getFlightNumber() {

        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getCountPassenger() {
        return this.passenger.size();
    }

    public void  addPassenger(Passenger passenger) {
        this.passenger.add(passenger);
    }

    public int canGetSeatCapacity(){return planeType.getSeatCapacity();}

    public int canGetWeight(){return planeType.getWeight();}

    public int numberOfAvailableSeats(){
        int availableSeats = planeType.getSeatCapacity() -  this.passenger.size();
          return availableSeats;
    }


    public int BookedBaggageWeight(){
        return planeType.getSeatCapacity();
    }



}
