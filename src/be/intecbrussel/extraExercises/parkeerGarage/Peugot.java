package be.intecbrussel.extraExercises.parkeerGarage;

public class Peugot extends Car {

    Peugot (String name) {
        this(name,0);
    }
    Peugot (String name, double weight) {
        super(name, weight);
        super.setBrandName(name);
        super.setWeight(weight);
    }

    Peugot(Car c) {
        super(c);
    }

    //methods
    @Override
    public String toString () {
        return (super.getBrandName() + "(" + super.getWeight() + ")");
    }

    @Override
    public void fuelUp() {
        System.out.println("This car runs on gas.");
    }
}
