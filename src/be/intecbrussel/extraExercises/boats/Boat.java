package be.intecbrussel.extraExercises.boats;

public abstract class Boat {
    private String name;
    private double weight;
    private double topSpeed;
    Captain person;

    public abstract void accelerate();
}
