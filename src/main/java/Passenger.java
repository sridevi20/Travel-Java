public class Passenger {
    private String name;
    private int numberOfBags;
    private int flightNumber;
//    private int randomSeatNumber;

    public Passenger(String name, int numberOfBags, int flightNumber) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flightNumber = flightNumber;
//        this.randSeatNumber = randSeatNumber;
    }
    public String getName(){

        return this.name;
    }

    public int getBags()
    {
        return this.numberOfBags;
    }

    public int getFlightNumber() {

        return this.flightNumber;
    }

//    public int getRandomSeatNumber() {
//        return this.randomSeatNumber;
//    }
}
