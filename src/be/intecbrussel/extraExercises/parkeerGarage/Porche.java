package be.intecbrussel.extraExercises.parkeerGarage;

public class Porche extends Car {

    //constructors
    Porche (String name) {
        this(name,0);
    }
    Porche (String name, double weight) {
        super(name, weight);
        super.setBrandName(name);
        super.setWeight(weight);
    }

    Porche (Car c) {
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
