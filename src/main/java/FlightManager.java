import java.util.ArrayList;

public class FlightManager {
  private PlaneType planeType;
    private Flight flight;
    private FlightManager flightManager;
    private Plane plane;
    private ArrayList< Passenger> passenger;


    public FlightManager(PlaneType planeType, Flight flight) {
        this.planeType =  planeType;
        this.flight =  flight;
        this.passenger = new ArrayList<Passenger>();

    }

//    public Flight getBaggageWeightForEachPerson(Flight flight){
//        int baggageForPerson = (this.weight /2) / (this.seatCapacity);
//            return  baggageForPerson;
//
//
//
//    }

    public int  getBaggageWeightForEachPerson() {
       int baggageForPerson = (planeType.getWeight() / 2) / (planeType.getSeatCapacity());
         return  baggageForPerson;



    }
    public void  addPassenger(Passenger passenger) {

        this.passenger.add(passenger);
    }

    public int getCountPassenger() {
        return this.passenger.size();
    }

   public int baggageWeightBookedByPassenegerOfFlight(){
        int baggageWeightPerPassenger = (getBaggageWeightForEachPerson()) * (this.passenger.size());
             return baggageWeightPerPassenger;

   }



    public int baggageWeightRemainingForFlight() {
        int baggageWeightRemaining = flight.numberOfAvailableSeats()*(getBaggageWeightForEachPerson());
         return baggageWeightRemaining;
    }
}


