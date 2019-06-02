import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;


   @Before

    public void setUp() {
       passenger1 = new Passenger("Anna", 1,333);
       passenger2 = new Passenger("Mary", 1,222);
       passenger3 = new Passenger("Abby",1,111);

    }

    public Passenger getPassenger() {
        return passenger1;
    }

    @Test
    public void hasName(){
       assertEquals("Anna", passenger1.getName());
    }
    @Test
    public void hasNumberOfBags(){
       assertEquals(2, passenger1.getBags());
    }

    @Test
    public void hasFlightNumber() {
       assertEquals(222, passenger2.getFlightNumber());
    }
}
