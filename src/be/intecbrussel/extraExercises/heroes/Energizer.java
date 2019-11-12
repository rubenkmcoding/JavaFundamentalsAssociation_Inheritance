package be.intecbrussel.extraExercises.heroes;

public class Energizer extends Hero {

    Energizer () {
        this("");
    }

    Energizer (String alias) {
        this (alias,0);
    }

    Energizer (String alias, int age) {
        setAlias(alias);
        setAge(age);
    }


    @Override
    void useSuperPower() {

    }
}
