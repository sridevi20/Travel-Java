import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

private  FlightManager flightManager;
private Flight flight;
private Passenger passenger;
private Passenger passenger1;
private Passenger passenger2;
private Passenger passenger3;
private Passenger passenger4;
private Passenger passenger5;
//private  PlaneType planeType;
//private Plane plane;


@Before
    public void setUp(){
    flightManager = new FlightManager(PlaneType.AIRBUS330 ,flight);
   flight = new Flight(300,"GLA","HEATHROW","6am", PlaneType.AIRBUS330);
//    planeType = new PlaneType(300,12000);
    passenger = new Passenger("Kathy",1,666);
    passenger1 = new Passenger("Anna",1,333);
    passenger2 = new Passenger("Mary", 1,222);
    passenger3 = new Passenger("Abby",1,111);
    passenger4 = new Passenger("Claire",1,444);
    passenger5 = new Passenger("Liza",1,555);


}
@Test
    public void baggageWeightForEachPassenger(){

    assertEquals(20, flightManager.getBaggageWeightForEachPerson());

}
@Test
    public void  baggageWeightBookedForPassenger(){
//    flight.addPassenger(passenger1);
    flightManager.addPassenger(passenger1);
    flightManager.addPassenger(passenger2);
    flightManager.addPassenger(passenger3);
    flightManager.addPassenger(passenger4);
    flightManager.addPassenger(passenger5);
    flightManager.getCountPassenger();
    assertEquals(100, flightManager.baggageWeightBookedByPassenegerOfFlight());
}
@Test
    public void baggageWeightForRemainingForFlight(){
//    flightManager.addPassenger(passenger1);
//    flightManager.addPassenger(passenger2);
//    flightManager.addPassenger(passenger3);
//    flightManager.addPassenger(passenger4);
    flight.addPassenger(passenger5);
    flight.getCountPassenger();
    assertEquals(5900,flightManager.baggageWeightRemainingForFlight());
}




}
