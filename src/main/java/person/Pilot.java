package person;

public class Pilot extends Employee{

    private int licenceNumber;

    public Pilot (String name, RankType rank, int licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;

    }

    public int getLicenceNumber() {
        return licenceNumber;
    }
}
