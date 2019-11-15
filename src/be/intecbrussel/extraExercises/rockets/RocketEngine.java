package be.intecbrussel.extraExercises.rockets;

public class RocketEngine {

    //properties
    private double usage; // l/kg/km

    //constructors
    RocketEngine () {
        this(0);
    }

    RocketEngine (double usuage) {
        this.setUsage(usuage);
    }

    //setter
    public void setUsage(double usage) {
        this.usage = usage;
    }

    //getter
    public double getUsage() {
        return usage;
    }
}
