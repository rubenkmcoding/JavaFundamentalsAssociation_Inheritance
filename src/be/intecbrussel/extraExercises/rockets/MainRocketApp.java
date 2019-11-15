package be.intecbrussel.extraExercises.rockets;

public class MainRocketApp {
    public static void main(String[] args) {

        //declaring and initializing
        Rocket rocket1 = new Rocket (150_000_000,"10 satellites",200, "Douglas");
        rocket1.setPilotAge(42);
        Rocket rocket2 = new Rocket(25_000_000,"robots", 250,"Han", 65);
        rocket2.setFuelEfficiency(60);
        Rocket rocket3 = new Rocket(40_000_000, "solar panels", 20);

        System.out.println(rocket1.getDistance());
        System.out.println(rocket2.getDistance());
        System.out.println(rocket3.getDistance());

    }
}
