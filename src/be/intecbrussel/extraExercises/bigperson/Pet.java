package be.intecbrussel.extraExercises.bigperson;

public abstract class Pet {
    private double weight;
    private String name;
    private int age;
    protected int realAge;

    //constructor
    Pet () {
        this(null,0);
    }

    Pet (String name, int age) {
        this(name,age,0);
    }
    Pet (String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    //setters
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRealAge() {
        return realAge;
    }
}
