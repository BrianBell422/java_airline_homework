package person;

public class CabinCrew extends Employee{

    public CabinCrew (String name, RankType rank) {
        super(name, rank);
    }

    public String messageToPassengers(String message) {
        return message;
    }

}
