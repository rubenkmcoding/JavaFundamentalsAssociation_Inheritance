package be.intecbrussel.extraExercises.rockets;

public class Tank {

    //properties
    private double fuelCapacity;

    //constructors
    Tank () {
        this (0);
    }

    Tank (double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    //setter
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    //getter
    public double getFuelCapacity() {
        return fuelCapacity;
    }

}
