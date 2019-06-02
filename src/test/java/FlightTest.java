import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    private Flight flight;
    private  Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;


    @Before
     public void setUp() {
        flight = new Flight(333, "GLA","Heathrow","6am", PlaneType.AIRBUS330);
       plane = new Plane(PlaneType.AIRBUS330);
        passenger1 = new Passenger("Mary", 1,222);
        passenger2 = new Passenger("Anna",1,333);
        passenger3 = new Passenger("Abby",1,111);


    }
    @Test
    public void emptyPassengerList(){
        assertEquals(0, flight.getCountPassenger()
        );
    }

    @Test
    public void hasFlightNumber() {
        assertEquals(333, flight.getFlightNumber());
    }

    @Test
            public void hasDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Heathrow", flight.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime(){
        assertEquals("6am", flight.getDepartureTime() );
    }
    @Test
    public void numberOfTotalAvailableSeats(){
//        assertEquals(PlaneType.AIRBUS330, plane.getPlaneType());
        assertEquals(300, flight.canGetSeatCapacity());
    }
    @Test
    public void canBookPassenger(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3 , flight.getCountPassenger());


    }
    @Test
    public void countAvailableSeatCapacity(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger((passenger3));
        assertEquals(297, flight.numberOfAvailableSeats());
    }

}


