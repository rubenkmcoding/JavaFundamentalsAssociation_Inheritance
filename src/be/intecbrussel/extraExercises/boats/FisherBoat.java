package be.intecbrussel.extraExercises.boats;

public class FisherBoat extends Boat {

    //properties
    private int netSize;
    Deckhand deckhand;

    //constructors
    FisherBoat () {
        this("");
    }

    FisherBoat (String name) {
        this(name,0);
    }

    FisherBoat (String name,double weight) {
        this(name, weight,0);
    }

    FisherBoat (String name, double weight, double topSpeed) {
        this(name,weight,topSpeed,null);
    }

    FisherBoat (String name, double weight, double topSpeed, Captain person) {
        this(name,weight,topSpeed, person, 0);
    }

    FisherBoat (String name, double weight, double topSpeed, Captain person, int netSize) {
        this(name,weight,topSpeed, person, netSize, null);
    }

    FisherBoat (String name, double weight, double topSpeed, Captain person, int netSize, Deckhand deckhand) {
        super(name,weight,topSpeed, person);
        this.netSize = netSize;
        this.deckhand = deckhand;
    }

    //setter
    public void setNetSize(int netSize) {
        this.netSize = netSize;
    }

    public void setDeckhand(Deckhand deckhand) {
        this.deckhand = deckhand;
    }

    //getter
    public int getNetSize() {
        return netSize;
    }

    public Deckhand getDeckhand() {
        return deckhand;
    }

    @Override
    public void accelerate() {
        System.out.println("The fishing boat lifts the net and goes faster.");
    }
}
