package flight;

import person.CabinCrew;
import person.Employee;
import person.Passenger;
import person.Pilot;
import plane.Plane;
import plane.PlaneType;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, int flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        int availableSeats = this.planeType.getCapacity() - this.passengers.size();
        return availableSeats;
    }

    public String addPassenger(Passenger passenger) {
        int availableSeats = getAvailableSeats();
        if (availableSeats > 0) {
            this.passengers.add(passenger);
            passenger.setBookedFlightNumber(this.flightNumber);
            passenger.setBookedSeatNumber(getRandomSeatNumber());
            return "Booking confirmed";
        } else {
            return "Sorry flight full";
        }
    }

    public int getRandomSeatNumber() {
        return (int) (Math.random() * (planeType.getCapacity()) + 1);
    }
}
