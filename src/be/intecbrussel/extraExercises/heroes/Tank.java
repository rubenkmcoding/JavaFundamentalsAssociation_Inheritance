package be.intecbrussel.extraExercises.heroes;

public class Tank extends Hero {

    Tank () {
        this ("");
    }

    Tank (String alias) {
        this (alias,0);
    }

    Tank (String alias, int age) {
        setAlias(alias);
        setAge(age);
    }

    @Override
    void useSuperPower() {
    }
}
