package person;

public class Passenger {

    private String name;
    private int numberOfBags;
    private int bookedFlightNumber;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.bookedFlightNumber = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public int getBookedFlightNumber() {
        return bookedFlightNumber;
    }

    public void setBookedFlightNumber(int bookedFlightNumber) {
        this.bookedFlightNumber = bookedFlightNumber;
    }
}
