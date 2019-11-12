package be.intecbrussel.extraExercises.heroes;

public class ShapeShifter extends Hero {

    ShapeShifter() {
        this ("");
    }

    ShapeShifter(String alias) {
        this(alias,0);
    }

    ShapeShifter(String alias, int age) {
        setAlias(alias);
        setAge(age);
    }

    @Override
    void useSuperPower() {

    }
}
