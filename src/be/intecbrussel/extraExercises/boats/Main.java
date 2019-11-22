package be.intecbrussel.extraExercises.boats;

public class Main {
    public static void main(String[] args) {
        Person captain1 = new Captain("Maarten",25);
        Person captain2 = new Captain("Justin", 24);
        Person captain3 = new Captain("Cyriel", 70);
        Person deckhand = new Deckhand("Duimpje", 72);
        Boat boat1 = new SailBoat("King of Namur", 550, 12, (Captain) captain1,14);
        Boat boat2 = new SpeedBoat("fastBoy", 2000, 122, (Captain) captain2, 255);
        Boat boat3 = new FisherBoat("ZS4", 8000,40,(Captain) captain3, 60, (Deckhand) deckhand);

        System.out.println(boat1.getName());
        System.out.println(boat2.getWeight());
        System.out.println(((FisherBoat) boat3).getNetSize());

        boat1.accelerate();
        boat2.accelerate();
        boat3.accelerate();
    }
}
