package be.intecbrussel.extraExercises.animals;

public class AfricanPenguin extends Animal{

    AfricanPenguin () {
        super();
    }

    AfricanPenguin (String name) {
        super(name);
    }

    AfricanPenguin (String name, String gender) {
        super(name, gender);
    }

    AfricanPenguin (String name, String gender, int age) {
        super(name, gender, age);
        super.setSpecies("African Penguin");
            }


}
