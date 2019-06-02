public enum PlaneType {
    AIRBUS330(300, 12000 ),
    BOEING247(100, 10000 ),
    MCDONNELDOUGLAS11F(120 ,7000),
    EMBRAER120(30, 4800),
    VICKERS(30, 1520);


    private final int seatCapacity;
    private final int weight;

    PlaneType(int seatCapacity , int  weight) {
        this.seatCapacity = seatCapacity;
        this.weight = weight;
    }

    public int getSeatCapacity() {
        return this.seatCapacity;
    }
    public int getWeight()
    {
        return this.weight;
    }




}


