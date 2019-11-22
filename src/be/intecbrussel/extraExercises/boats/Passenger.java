package be.intecbrussel.extraExercises.boats;

public class Passenger extends Person  {

    //properties
    private String destination;

    Passenger() {
        super();
    }

    Passenger(String name) {
        super(name);
    }

    Passenger(String name, int age) {
        super(name, age);
    }

    Passenger(String name, int age, String destination) {
        super(name, age);
        this.destination = destination;
    }

    //setter
    public void setDestination(String destination) {
        this.destination = destination;
    }

    //getter
    public String getDestination() {
        return destination;
    }


}
