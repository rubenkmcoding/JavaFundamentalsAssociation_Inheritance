package be.intecbrussel.extraExercises.boats;

public abstract class Boat {
    private String name;
    private double weight;
    private double topSpeed;
    private Captain person;

    //constructors
    Boat () {
        this("");
    }

    Boat (String name) {
        this(name, 0);
    }

    Boat (String name, double weight) {
        this(name, weight, 0);
    }

    Boat (String name, double weight, double topSpeed) {
        this(name,weight, topSpeed, null);
    }
    Boat (String name, double weight, double topSpeed, Captain person) {
        this.name = name;
        this.weight = weight;
        this.topSpeed = topSpeed;
        this.person = person;
    }

    //abstract method
    public abstract void accelerate();

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setPerson(Captain person) {
        this.person = person;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Captain getPerson() {
        return person;
    }

    public double getTopSpeed() {
        return topSpeed;
    }
}
