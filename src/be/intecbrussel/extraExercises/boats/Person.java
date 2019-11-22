package be.intecbrussel.extraExercises.boats;

public abstract class Person {

    //properties
    private String name;
    private int age;

    //constructors
    Person () {
        this("");
    }

    Person (String name) {
        this(name,0);
    }

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
