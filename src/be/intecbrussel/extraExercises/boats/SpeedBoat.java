package be.intecbrussel.extraExercises.boats;

public class SpeedBoat extends Boat {

    //properties
    private int horsePower;

    //constructor
    SpeedBoat () {
        this("");
    }

    SpeedBoat (String name) {
        this(name,0);
    }

    SpeedBoat (String name,double weight) {
        this(name, weight,0);
    }

    SpeedBoat (String name, double weight, double topSpeed) {
        this(name,weight,topSpeed,null);
    }

    SpeedBoat (String name, double weight, double topSpeed, Captain person) {
        this(name,weight,topSpeed, person, 0);
    }

    SpeedBoat (String name, double weight, double topSpeed, Captain person, int horsePower) {
        super(name,weight,topSpeed, person);
        this.horsePower = horsePower;
    }

    //setter
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //getter
    public int getHorsePower() {
        return horsePower;
    }

    //method
    @Override
    public void accelerate() {
        System.out.println("The speedboat goes faster due to going into a higher gear.");
    }

}
