package be.intecbrussel.extraExercises.boats;

public class SailBoat extends Boat {

    //properties
    private int sailSize;

    //constructors
    SailBoat () {
        this("");
    }

    SailBoat (String name) {
        this(name,0);
    }

    SailBoat (String name,double weight) {
        this(name, weight,0);
    }

    SailBoat (String name, double weight, double topSpeed) {
        this(name,weight,topSpeed,null);
    }

    SailBoat (String name, double weight, double topSpeed, Captain person) {
        this(name,weight,topSpeed, person, 0);
    }

    SailBoat (String name, double weight, double topSpeed, Captain person, int sailSize) {
        super(name,weight,topSpeed, person);
        this.sailSize = sailSize;
    }

    //setter
    public void setSailSize(int sailSize) {
        this.sailSize = sailSize;
    }

    //getter
    public int getSailSize() {
        return sailSize;
    }

    //methode
    @Override
    public void accelerate() {
        System.out.println("The sailboat opens sails to catch more wind to speed up ship.");
    }
}
