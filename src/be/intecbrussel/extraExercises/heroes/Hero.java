package be.intecbrussel.extraExercises.heroes;

public abstract class Hero {
    //properties
    private String alias = "";
    private int age = 0;

    //methods

    void Hero () {

    }

    abstract void useSuperPower ();

    void setAlias (String alias) {
        this.alias = alias;
    }

    String getAlias (){
        return alias;
    }

    void setAge (int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString () {
        return "Hero [alias =" + alias + ", age" + age + "]";
    }
}
