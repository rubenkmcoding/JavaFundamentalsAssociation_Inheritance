package be.intecbrussel.extraExercises.heroes;

public class ArmoredHero extends Hero {

    public ArmoredHero() {
        this("", 0);
    }

    public ArmoredHero(String alias) {
        this(alias, 0);
    }

    public ArmoredHero(String alias, int age) {
        super();
        this.setAlias(alias);
        this.setAge(age);
    }

    @Override
    public void useSuperPower() {
    }

}