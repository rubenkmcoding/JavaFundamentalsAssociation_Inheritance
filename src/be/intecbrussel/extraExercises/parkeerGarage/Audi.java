package be.intecbrussel.extraExercises.parkeerGarage;

public class Audi extends Car {

    //constructors
    Audi (String name) {
        this(name,0);
    }
    Audi (String name, double weight) {
        super(name, weight);
        super.setBrandName(name);
        super.setWeight(weight);
    }

    Audi (Car c) {
        super(c);
    }

    //methods
    @Override
    public String toString () {
        return (this.getBrandName() + "(" + this.getWeight() + ")");
    }

    @Override
    public void fuelUp() {
        System.out.println("This car runs on gas.");
    }
}
