package Model;

public class Player{

    public Player(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public  Player(){}
    private String name;

    private int credits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}