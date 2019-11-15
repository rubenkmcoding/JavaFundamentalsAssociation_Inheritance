package be.intecbrussel.extraExercises.rockets;

public class Rocket {

    //properties

    private Tank fuelTank;
    private RocketEngine engine;
    private Person pilot;
    private String payload;

    private double payLoadWeight;
    private double distance;

    //constructors

    Rocket () {
        this (0);
    }

    Rocket (double fuelCapacity) {
        this(fuelCapacity, "", 0);
    }

    Rocket (double fuelCapacity, String payload, double payLoadWeight) {
        this(fuelCapacity, payload, payLoadWeight, "");
    }

    Rocket (double fuelCapacity, String payload, double payLoadWeight, String pilotName) {
        this(fuelCapacity, payload, payLoadWeight, pilotName, 0);
    }

    Rocket (double fuelCapacity, String payload, double payLoadWeight, String pilotName, int pilotAge) {
        //initializing objects
        this.fuelTank = new Tank(fuelCapacity);
        this.engine = new RocketEngine(50);
        this.pilot = new Person(pilotName, pilotAge);
        this.setPayload(payload);
        this.setPayLoadWeight(payLoadWeight);
        this.setDistance();
    }

    //setters

    public void setPayLoadWeight(double payLoadWeight) {
        this.payLoadWeight = payLoadWeight;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public void setPilot(String name) {
        this.pilot = new Person(name);
    }

    public void setPilotAge(int age) {
        this.pilot.setAge(age);
    }

    public void setFuelEfficiency(int fuelEfficiency) {
        this.engine.setUsage(fuelEfficiency);
        this.setDistance();
    }

    public void setFuelCapactity (double fuelCapacity) {
        this.fuelTank.setFuelCapacity(fuelCapacity);
    }

    //calculation setter

    public void setDistance() {
        this.distance = this.fuelTank.getFuelCapacity() / (payLoadWeight * (double) this.engine.getUsage());
    }


    //getters

    public double getPayLoadWeight() {
        return payLoadWeight;
    }

    public String getPayload() {
        return payload;
    }

    public double getFuelEfficiency() {
        return engine.getUsage();
    }

    public double getDistance() {
        return distance;
    }

    //action methods

    void liftOff () {

    }
}
