package be.intecbrussel.extraExercises.parkeerGarage;

public class BMW extends Car {

    //constructors
    BMW (String name) {
        this(name,0);
    }
    BMW (String name, double weight) {
        super(name, weight);
        super.setBrandName(name);
        super.setWeight(weight);
    }

    BMW (Car c) {
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
