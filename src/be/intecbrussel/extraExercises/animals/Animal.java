package be.intecbrussel.extraExercises.animals;

import javax.xml.namespace.QName;

public class Animal {

    //properties
    String species;
    String name;
    String gender;
    int age;

    //making object
    Animal () {
        this("");
    }

    Animal (String name) {
        this (name, "");
    }

    Animal (String name, String gender) {
        this (name, gender, 0);
    }

    Animal (String name, String gender, int age) {
        this (name, gender, age, "");
    }

    Animal (String name, String gender, int age, String species) {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
        this.setSpecies(species);
    }


    //setters
    void setSpecies (String species) {
        this.species = species;
    }

    void setName (String name) {
        this.name = name;
    }

    void setGender (String gender) {
        this.gender = gender;
    }

    void setAge (int age) {
        this.age = age;
    }

    //Getters
    String getSpecies () {
        return species;
    }

    String getName () {
        return name;
    }

    String getGender () {
        return gender;
    }

    int getAge () {
        return age;
    }

    @Override
    public String toString () {
        return  name + "\n Species: " + species + "\n Gender: " + gender + "\n Age: " + age;
    }
}
