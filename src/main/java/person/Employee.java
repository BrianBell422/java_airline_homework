package person;

public abstract class Employee {

    private String name;
    private RankType rank;

    public Employee(String name, RankType rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public RankType getRank() {
        return rank;
    }
}
