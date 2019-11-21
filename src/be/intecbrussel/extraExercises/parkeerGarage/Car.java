package be.intecbrussel.extraExercises.parkeerGarage;

public abstract class Car {

    //properties
    private String brandName = "";
    double weight = 0;

    //constructors
    Car (String name) {
        this(name,0);
    }
    Car (String name, double weight) {
        this.brandName = name;
        this.weight = weight;
    }

    Car (Car c) {
        this (c.getBrandName(), c.getWeight());
    }

    //setters
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //getters
    public String getBrandName() {
        return brandName;
    }

    public double getWeight() {
        return weight;
    }

    //methods
    public abstract void fuelUp ();

}
