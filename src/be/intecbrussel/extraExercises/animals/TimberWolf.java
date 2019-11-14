package be.intecbrussel.extraExercises.animals;

public class TimberWolf extends Animal {

    TimberWolf () {
        super();
    }

    TimberWolf (String name) {
        super(name);
    }

    TimberWolf (String name, String gender) {
        super(name, gender);
    }

    TimberWolf (String name, String gender, int age) {
        super(name, gender, age);
        super.setSpecies("Timber Wolf");
    }



}
