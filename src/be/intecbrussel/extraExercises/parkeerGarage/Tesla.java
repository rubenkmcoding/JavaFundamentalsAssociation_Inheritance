package be.intecbrussel.extraExercises.parkeerGarage;

public class Tesla extends Car {

    //constructors
    Tesla (String name) {
        this(name,0);
    }
    Tesla (String name, double weight) {
        super(name, weight);
        super.setBrandName(name);
        super.setWeight(weight);
    }

    Tesla (Car c) {
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
