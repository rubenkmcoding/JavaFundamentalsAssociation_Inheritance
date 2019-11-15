package be.intecbrussel.extraExercises.rockets;

public class Person {

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
        this.setName(name);
        this.setAge(age);
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
